package com.windrises.core.entity.po;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 10:57
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class QuartzJob extends BasePo {

    /**
     * 任务名称
     */
    private String jobName;

    /**
     * 实例名
     */
    private String beanName;

    /**
     * 参数
     */
    private String params;

    /**
     * 表达式
     */
    private String cronExpression;

    /**
     * 状态
     */
    private String status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;
}