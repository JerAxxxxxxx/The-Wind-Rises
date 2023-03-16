#!/bin/bash
BASE_LOG_LINE=10
function get_kubectl_log() {
  if [ -z "$1" ]; then
    echo "服务名为空!"
  else
    echo "开始查询 $1 的 kubectl 日志"
    task_pid=$(kubectl get pods -A | grep "$1" | awk '{print $2}')
    if [ -z "$task_pid" ]; then
      echo "找不到 $1 进程!"
    else
      kubectl logs -f --tail ${BASE_LOG_LINE} -n linkapp "${task_pid}"
    fi
  fi
}

get_kubectl_log "$1"
