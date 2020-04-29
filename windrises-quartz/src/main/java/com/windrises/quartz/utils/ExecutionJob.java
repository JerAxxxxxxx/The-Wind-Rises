package com.windrises.quartz.utils;

import com.windrises.core.entity.po.QuartzJob;
import com.windrises.core.entity.po.QuartzLog;
import com.windrises.core.mapper.QuartzLogMapper;
import com.windrises.core.utils.SpringContextHolder;
import com.windrises.core.utils.ThrowableUtil;
import com.windrises.quartz.service.IQuartzJobService;
import com.windrises.quartz.thread.ThreadPoolExecutorUtil;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import static com.windrises.core.contants.JobConstant.PAUSE;
import static com.windrises.core.contants.JobConstant.START;

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
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        QuartzJob quartzJob = (QuartzJob) context.getMergedJobDataMap().get(QuartzJob.JOB_KEY);
        // 获取spring bean
        QuartzLogMapper quartzLogMapper = SpringContextHolder.getBean(QuartzLogMapper.class);
        IQuartzJobService quartzJobService = SpringContextHolder.getBean(IQuartzJobService.class);

        QuartzLog quartzLog = new QuartzLog();
        quartzLog.setJobName(quartzJob.getJobName());
        quartzLog.setBeanName(quartzJob.getBeanName());
        quartzLog.setMethodName(quartzJob.getMethodName());
        quartzLog.setParams(quartzJob.getParams());
        long startTime = System.currentTimeMillis();
        quartzLog.setCronExpression(quartzJob.getCronExpression());
        try {
            log.info("任务准备执行，任务名称：{}", quartzJob.getJobName());
            QuartzRunnable task = new QuartzRunnable(quartzJob.getBeanName(), quartzJob.getMethodName(),
                    quartzJob.getParams());
            Future<?> future = EXECUTOR.submit(task);
            future.get();
            long times = System.currentTimeMillis() - startTime;
            quartzLog.setElapsedTime(times);
            // 任务状态
            quartzLog.setStatus(START);
            log.info("任务执行完毕，任务名称：{} 总共耗时：{} 毫秒", quartzJob.getJobName(), times);
        } catch (Exception e) {
            log.error("任务执行失败，任务名称：{}" + quartzJob.getJobName(), e);
            long times = System.currentTimeMillis() - startTime;
            quartzLog.setElapsedTime(times);
            // 任务状态 0：成功 1：失败
            quartzLog.setStatus("1");
            quartzLog.setExceptionDetail(ThrowableUtil.getStackTrace(e));
            quartzJob.setStatus(PAUSE);
            //更新状态
            quartzJobService.updateStatus(quartzJob);
        } finally {
            quartzLogMapper.insertSelective(quartzLog);
        }
    }
}
