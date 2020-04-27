package com.windrises.quartz.thread;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 线程池配置属性类
 *
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 11:18
 */
@Data
@Component
@ConfigurationProperties(prefix = "task.pool")
public class AsyncTaskProperties {
    /**
     * 核心线程数
     */
    private int corePoolSize;

    /**
     * 最大线程数
     */
    private int maxPoolSize;

    /**
     * 活跃时间
     */
    private int keepAliveSeconds;

    /**
     * 队列容量
     */
    private int queueCapacity;
}
