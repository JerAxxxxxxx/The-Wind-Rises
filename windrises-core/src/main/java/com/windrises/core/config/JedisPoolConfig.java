package com.windrises.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/28 16:35
 */
@Data
@Component
@ConfigurationProperties(prefix = "jedis-pool")
public class JedisPoolConfig {

}
