#!/bin/bash

function stop_server() {
  task_pid=$(ps -ef | grep "test_smbserver.py" | grep -v grep | awk '{print $2}')
  if [ -z "${task_pid}" ]; then
    echo -e "\033[31m 暂无 smbserver 服务进程! \033[0m"
  else
    kill -9 "${task_pid}"
    echo -e "\033[32m 已关闭 smbserver 服务进程 \033[0m"
  fi
}

function start_server() {
  task_pid=$(ps -ef | grep "test_smbserver.py" | grep -v grep | awk '{print $2}')
  if [ -z "${task_pid}" ]; then
    nohup python3 /home/ram/impacket-master/impacket/test_smbserver.py -username root -password 123456 -hashes LMHASH -ip 192.168.1.134 -port 445 -smb2support 'linkapp' /usr/linkapp/data/nas/cache >run.log 2>&1 &
    echo -e "\033[32m smbserver 服务已启动 \033[0m"
  else
    echo "smbserver 服务进程已存在!"
  fi
}

function restart_sever() {
  stop_server
  sleep 1
  start_server
}

function health_check() {
  task_pid=$(ps -ef | grep "test_smbserver.py" | grep -v grep | awk '{print $2}')
  if [ -z "${task_pid}" ]; then
    echo -e "\033[31m 服务进程不存在! \033[0m"
  else
    echo -e "\033[32m 服务进程正常 \033[0m"
  fi
}

function logs() {
  clear
  tail -333f run.log
}

function main() {
  case "$1" in
  start)
    start_server
    ;;
  stop)
    stop_server
    ;;
  restart)
    restart_sever
    ;;
  check)
    health_check
    ;;
  log)
    logs
    ;;
  *)
    echo "USAGE:sh $0 {start|stop|restart|check|log} [-d]"
    ;;
  esac
}

main "$1"
