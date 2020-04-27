package com.windrises.quartz.utils;

import com.windrises.quartz.thread.ThreadPoolExecutorUtil;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 11:10
 */
@Async
@Slf4j
public class ExecutionJob extends QuartzJobBean {


    private final static ThreadPoolExecutor EXECUTOR = ThreadPoolExecutorUtil.getPoll();


    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {

    }
}
