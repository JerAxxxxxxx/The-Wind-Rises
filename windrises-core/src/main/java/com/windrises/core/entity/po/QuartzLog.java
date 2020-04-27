package com.windrises.core.entity.po;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 11:06
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuartzLog extends BasePo {

    /**
     * 任务名称
     */
    private String jobName;

    /**
     * Bean名称
     */
    private String beanName;

    /**
     * 方法名称
     */
    private String methodName;

    /**
     * 参数
     */
    private String params;

    /**
     * cron表达式
     */
    private String cronExpression;

    /**
     * 状态
     */
    private String status;

    /**
     * 异常详细
     */
    private String exceptionDetail;

    /**
     * 耗时（毫秒）
     */
    private Integer elapsedTime;

    /**
     * 创建日期
     */
    private Date createTime;
}