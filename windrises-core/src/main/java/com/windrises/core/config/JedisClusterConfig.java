package com.windrises.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/28 16:16
 */
@Data
@Component
@ConfigurationProperties(prefix = "jedis-cluster")
public class JedisClusterConfig {
    /**
     * 节点,多节点用逗号隔开
     */
    private String[] nodes;

    /**
     * jedis连接池
     */
    private JedisPoolConfig poolConfig;

    /**
     * 超时时间
     */
    private Integer connectionTimeOut;
    private Integer soTimeOut;
    private Integer maxAttempt;

    /**
     * 密码
     */
    private String password;
}
