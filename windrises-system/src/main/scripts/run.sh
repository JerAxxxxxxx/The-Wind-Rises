#!/bin/bash

#Function:启停springboot服务
. /etc/rc.d/init.d/functions
source /etc/profile
source ~/.bash_profile
#export JAVA_HOME=/usr/local/jdk
#export PATH=$JAVA_HOME/bin:$PATH

#该脚本所在目录
RUN_HOME=$(dirname $(readlink -f "$0"))
#加载配置文件
CLASS_PATH=.:$RUN_HOME/../etc
#load apps jar
for v_i in $(ls $RUN_HOME/../apps/*.jar); do
  CLASS_PATH=$CLASS_PATH:$v_i
done
# load libs jar
for v_i in $(ls $RUN_HOME/../libs/*.jar); do
  CLASS_PATH=$CLASS_PATH:$v_i
done

CLASS_PATH=$CLASS_PATH:$CLASSPATH

# 程序启动类
class_name="com.windrises.SystemApplication"
#JVM参数
JVM_OPTS=""
#启动参数
#PARAM_OPTS="--spring.profiles.active=test"
#远程调试参数
debug_params="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5014"

function get_pid() {
  #获取程序的pid
  task_pid=$(jps -lvm | grep "$class_name" | awk '{print $1}')
}

function start() {
  get_pid
  if [ -z "$task_pid" ]; then
    if [ "-d" == $1 ]; then
      echo -e "Starting service using debug mode.."
      nohup java $JVM_OPTS $debug_params -cp $CLASS_PATH $class_name $PARAM_OPTS $@ >$RUN_HOME/run.log 2>&1 &
    else
      echo -e "Starting service.."
      nohup java $JVM_OPTS -cp $CLASS_PATH $class_name $PARAM_OPTS $@ >$RUN_HOME/run.log 2>&1 &
    fi
    sleep 3
    get_pid
    #上个命令的返回状态
    retval=$?
    if [ $retval -eq 0 ]; then
      action "Service started successfully" /bin/true
    fi
  #如果pid已存在，则打印Task已启动
  else
    action "Service is already running , and the pid is $task_pid" /bin/false
  fi
}

function stop() {
  get_pid
  if [ -n "$task_pid" ]; then
    echo -e "Stopping Service..."
    /bin/kill -9 $task_pid
    sleep 3
    get_pid
    retval=$?
    if [ $retval -eq 0 ]; then
      action "Service stopped successfully" /bin/true
    fi
  else
    action "Service is not running" /bin/false
  fi
}

function main() {
  case "$1" in
  start)
    start $2
    ;;
  stop)
    stop
    ;;
  restart)
    stop
    start $2
    ;;
  *)
    echo "USAGE:sh $0 {start|stop|restart} [-d]"
    ;;
  esac
}

main $1 $2
