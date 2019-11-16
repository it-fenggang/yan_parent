package com.yan.base;

import com.yan.util.IdWorker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * 基础微服务启动类
 */
@SpringBootApplication
//@ComponentScan(basePackages = {"com.yan.base.mapper"})
@MapperScan({"com.yan.*.mapper"})
public class BaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class);
        System.out.println("=====基础微服务启动成功=====");
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
