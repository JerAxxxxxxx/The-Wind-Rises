package com.windrises.core.config;

import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @author <a href="https://mylhz.org">lhz</a>
 * @date 2022-12-14 11:37:00
 */
@Configuration
@EnableAsync
public class ThreadPoolTaskConfig {

    /**
     * 核心线程数（默认线程数）
     */
    private static final int CORE_POOL_SIZE = 20;
    /**
     * 最大线程数
     */
    private static final int MAX_POOL_SIZE = 100;
    /**
     * 允许线程空闲时间（单位：默认为秒）
     */
    private static final int KEEP_ALIVE_TIME = 10;
    /**
     * 缓冲队列大小
     */
    private static final int QUEUE_CAPACITY = 200;
    /**
     * 线程池名前缀
     */
    private static final String THREAD_NAME_PREFIX = "Async-Service-";

    /**
     * bean的名称，默认为首字母小写的方法名
     * `@Async(value = "taskExecutor")`
     *
     * @return
     */
    @Bean("taskExecutor")
    public ThreadPoolTaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(CORE_POOL_SIZE);
        executor.setMaxPoolSize(MAX_POOL_SIZE);
        executor.setQueueCapacity(KEEP_ALIVE_TIME);
        executor.setKeepAliveSeconds(QUEUE_CAPACITY);
        executor.setThreadNamePrefix(THREAD_NAME_PREFIX);
        // 线程池对拒绝任务的处理策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        // 初始化
        executor.initialize();
        return executor;
    }
}
