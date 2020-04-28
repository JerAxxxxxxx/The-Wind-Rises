package com.windrises.quartz.entity.form;

import com.windrises.core.entity.form.BaseForm;
import com.windrises.core.entity.po.QuartzJob;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/4/27 14:34
 */
@Data
@Accessors(chain = true)
public class QuartzJobForm extends BaseForm<QuartzJob> {

    /**
     * 任务名称
     */
    @NotBlank(message = "任务名称不能为空")
    private String jobName;

    /**
     * 实例名
     */
    @NotBlank(message = "任务名称不能为空")
    private String beanName;

    /**
     * 参数
     */
    @NotBlank(message = "任务名称不能为空")
    private String params;

    /**
     * 表达式
     */
    @NotBlank(message = "任务名称不能为空")
    private String cronExpression;

    /**
     * 备注
     */
    private String remark;
}
