package com.windrises.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * zookeeper配置文件
 *
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/29 16:49
 */
@Data
@Component
@ConfigurationProperties(prefix = "zookeeper")
public class ZookeeperConfig {

    /**
     * 主机的ip+port,多个用逗号分隔
     */
    private String connectString;

    /**
     * 会话超时时间(毫秒)
     */
    private int sessionTimeout;
}
