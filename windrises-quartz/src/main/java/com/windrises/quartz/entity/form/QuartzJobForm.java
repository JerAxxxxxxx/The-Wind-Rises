package com.windrises.quartz.entity.form;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.windrises.core.entity.form.BaseForm;
import com.windrises.core.entity.po.QuartzJob;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/4/27 14:34
 */
@Data
@Accessors(chain = true)
public class QuartzJobForm extends BaseForm<QuartzJob> {

    /**
     * 任务名称 @NotBlank 注解的参数不能为 Null 且 trim() 之后 size > 0
     */
    @NotBlank(message = "任务名称不能为空")
    private String jobName;

    /**
     * 适用于基本数据类型(Integer，Long，Double等等)，
     * 当 @NotNull 注解被使用在 String 类型的数据上，
     * 则表示该数据不能为 Null（但是可以为 Empty）
     */
    @NotNull(message = "id不能为空")
    private Integer id;
    /**
     * 适用于 String、Collection集合、Map、数组等等，
     * 加了@NotEmpty 注解的参数不能为 Null 或者 长度为 0
     */
    @NotEmpty(message = "List 不能为空")
    @Size(min = 2, message = "长度至少为2")
    private List<Integer> idList;

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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date testDate;
}
