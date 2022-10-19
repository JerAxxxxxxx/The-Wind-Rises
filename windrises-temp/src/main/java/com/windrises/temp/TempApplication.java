package com.windrises.temp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author JerAxxxxx
 * @version Revision 1.0.0
 * @date 2020/4/27 10:30
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.windrises.temp.mapper"})
public class TempApplication {
    public static void main(String[] args) {
        SpringApplication.run(TempApplication.class, args);
    }
}
