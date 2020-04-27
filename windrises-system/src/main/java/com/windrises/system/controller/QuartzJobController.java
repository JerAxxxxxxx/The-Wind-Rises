package com.windrises.system.controller;

import com.windrises.core.entity.po.QuartzJob;
import com.windrises.core.entity.vo.Result;
import com.windrises.quartz.entity.form.QuartzJobForm;
import com.windrises.quartz.service.IQuartzJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/insert")
    public Result insert(@Valid @RequestBody QuartzJobForm quartzJobForm) {
        QuartzJob quartzJob = quartzJobForm.toPo(QuartzJob.class);
        quartzJobService.insertSelective(quartzJob);
        return Result.success();
    }
}
