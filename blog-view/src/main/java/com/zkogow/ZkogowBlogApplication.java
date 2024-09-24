package com.zkogow;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @Author: WainZeng
 * @Date: 2024/9/20 22:48
 */

@SpringBootApplication
@MapperScan("com.zkogow.mapper")
public class ZkogowBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZkogowBlogApplication.class, args);
    }
}
