package com.windrises.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Curator配置文件
 *
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/29 16:49
 */
@Data
@Component
@ConfigurationProperties(prefix = "curator")
public class CuratorProperties {

    /**
     * 重试次数
     */
    private int retryCount;

    /**
     * 重试间隔时间
     */
    private int elapsedTimeMs;

    /**
     * zookeeper 地址
     */
    private String connectString;

    /**
     * session超时时间
     */
    private int sessionTimeoutMs;

    /**
     * 连接超时时间
     */
    private int connectionTimeoutMs;
}
