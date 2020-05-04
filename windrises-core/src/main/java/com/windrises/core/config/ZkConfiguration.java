package com.windrises.core.config;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 在spring初始化时将配置信息注入
 *
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/5/4 9:12
 */
@Configuration
public class ZkConfiguration {

    @Autowired
    private CuratorProperties curatorProperties;

    @Bean(initMethod = "start")
    public CuratorFramework curatorFramework() {
        return CuratorFrameworkFactory.newClient(
                curatorProperties.getConnectString(),
                curatorProperties.getSessionTimeoutMs(),
                curatorProperties.getConnectionTimeoutMs(),
                new RetryNTimes(curatorProperties.getRetryCount(), curatorProperties.getElapsedTimeMs()));
    }
}
