#!/bin/bash

BASE_LOG_LINE=10

function get_docker_log() {
  if [ -z "$1" ]; then
    echo "服务名为空!"
  else
    echo "开始查询 $1 的 docker 日志, 读取行数为: ${BASE_LOG_LINE}"
    task_pid=$(docker ps | grep "$1" | awk '{print $1}')
    if [ -z "$task_pid" ]; then
      echo "找不到 $1 进程!"
    else
      docker logs -f --tail ${BASE_LOG_LINE} "${task_pid}"
      # 过滤掉相关类的日志打印
      docker logs -f --tail ${BASE_LOG_LINE} "${task_pid}" | grep -v "MQClientFactoryScheduledThread"
    fi
  fi
}

clear
get_docker_log "$1"
