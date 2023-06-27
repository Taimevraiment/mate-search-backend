package com.taim.matesearch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类
 *
 * @author taim
 */
@SpringBootApplication
@MapperScan("com.taim.matesearch.mapper")
@EnableScheduling
public class MateSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(MateSearchApplication.class, args);
    }

}
