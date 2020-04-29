package com.windrises.system.controller;

import com.windrises.core.entity.po.QuartzJob;
import com.windrises.core.entity.vo.Result;
import com.windrises.core.utils.ZookeeperUtil;
import com.windrises.quartz.entity.form.QuartzJobForm;
import com.windrises.quartz.service.IQuartzJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 14:25
 */
@RestController
@RequestMapping("/quartzJob")
public class QuartzJobController {

    @Autowired
    private IQuartzJobService quartzJobService;

    @Autowired
    ZookeeperUtil zookeeperUtil;

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
    public String method() {
        boolean b = zookeeperUtil.addZEnode("/naocan", "kao nen ma!");
        return "" + b;
    }
}
