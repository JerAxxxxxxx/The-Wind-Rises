package com.windrises.system.controller;

import com.windrises.core.entity.po.QuartzJob;
import com.windrises.core.entity.vo.Result;
import com.windrises.core.utils.ZookeeperUtil;
import com.windrises.quartz.entity.form.QuartzJobForm;
import com.windrises.quartz.service.IQuartzJobService;
import lombok.extern.slf4j.Slf4j;
import org.apache.curator.framework.CuratorFramework;
import org.apache.zookeeper.data.Stat;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 14:25
 */
@Slf4j
@RestController
@RequestMapping("/quartzJob")
public class QuartzJobController {

    @Autowired
    private IQuartzJobService quartzJobService;


    @Autowired
    private CuratorFramework client;

    @Autowired
    private ZookeeperUtil zookeeperUtil;

    @PostMapping("/insert")
    public Result insert(@Valid @RequestBody QuartzJobForm quartzJobForm) {
        QuartzJob quartzJob = quartzJobForm.toPo(QuartzJob.class);
        quartzJobService.insertSelective(quartzJob);
        return Result.success();
    }

    @PostMapping("/update")
    public Result update(@Valid @RequestBody QuartzJobForm quartzJobForm) {
        QuartzJob quartzJob = quartzJobForm.toPo(QuartzJob.class);
        quartzJobService.insertSelective(quartzJob);
        return Result.success();
    }

    @GetMapping("test")
    public String method() throws Exception {
        Stat stat = client.setData().forPath("/shabi", "nijiushi ge shasbi".getBytes());
        log.info(stat + "");
        byte[] bytes = client.getData().forPath("/");
        return new String(bytes);
    }

    @GetMapping("test2")
    public String method2() throws Exception {
        Stat stat = ZookeeperUtil.checkExists("/shabi");
        ZookeeperUtil.create("/naocan", "shabi".getBytes());
        return stat + "";
    }
}
