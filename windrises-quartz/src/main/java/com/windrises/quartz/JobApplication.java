package com.windrises.quartz;

import com.windrises.core.utils.SpringContextHolder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author liuhaozhen
 * @version Revision 1.0.0
 * @date 2020/4/27 11:33
 */
@EnableAsync
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = {"com.windrises.core.mapper"})
public class JobApplication {
    public static void main(String[] args) {
        SpringApplication.run(JobApplication.class);
    }

    @Bean
    public SpringContextHolder springContextHolder() {
        return new SpringContextHolder();
    }
}
