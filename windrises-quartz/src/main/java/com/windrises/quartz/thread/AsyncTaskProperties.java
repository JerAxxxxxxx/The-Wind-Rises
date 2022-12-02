package com.windrises.quartz.thread;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import lombok.Data;

/**
 * 线程池配置属性类
 *
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 11:18
 */
@Data
@Component
@Validated
@ConfigurationProperties(prefix = "task.pool")
public class AsyncTaskProperties {
    /**
     * 核心线程数
     */
    @NotNull(message = "核心线程数不能为空")
    private int corePoolSize;

    /**
     * 最大线程数
     */
    @NotNull(message = "最大线程数不能为空")
    private int maxPoolSize;

    /**
     * 活跃时间
     */
    @NotNull(message = "活跃时间不能为空")
    private int keepAliveSeconds;

    /**
     * 队列容量
     */
    @NotNull(message = "队列容量不能为空")
    private int queueCapacity;
}
