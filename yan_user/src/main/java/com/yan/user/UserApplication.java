package com.yan.user;

import com.yan.util.IdWorker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 用户微服务启动类
 */
@SpringBootApplication
@MapperScan({"com.yan.*.mapper"})
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
        System.out.println("=====用户微服务启动成功=====");
    }
    /**
     * 初始化idWork
     * @return
     */
    @Bean
    public IdWorker idWorker(){
        return new IdWorker();
    }
}
