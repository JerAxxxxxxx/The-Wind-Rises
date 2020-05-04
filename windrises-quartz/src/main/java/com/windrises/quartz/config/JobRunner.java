package com.windrises.quartz.config;

import com.windrises.core.entity.po.QuartzJob;
import com.windrises.core.mapper.QuartzJobMapper;
import com.windrises.quartz.utils.QuartzManage;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

import static com.windrises.core.contants.JobConstant.START;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/29 9:44
 */
@Component
public class JobRunner implements ApplicationRunner {
    private final QuartzJobMapper quartzJobMapper;

    private final QuartzManage quartzManage;

    public JobRunner(QuartzJobMapper quartzJobMapper, QuartzManage quartzManage) {
        this.quartzJobMapper = quartzJobMapper;
        this.quartzManage = quartzManage;
    }

    /**
     * 项目启动时重新激活启用的定时任务
     *
     * @param applicationArguments /
     */
    @Override
    public void run(ApplicationArguments applicationArguments) {
        System.out.println("--------------------注入定时任务---------------------");
        //List<QuartzJob> quartzJobs = quartzJobMapper.findByPause(START);
        //quartzJobs.forEach(quartzManage::addJob);
        System.out.println("--------------------定时任务注入完成---------------------");
    }
}
