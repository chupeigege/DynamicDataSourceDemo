package vip.aquan.multidatasourcedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 基于 SpringBoot 多数据源 动态数据源
 * 教程链接: https://blog.csdn.net/weixin_43759756/article/details/130133798
 * 动态数据源项目的Gitee地址：https://gitee.com/baomidou/dynamic-datasource-spring-boot-starter
 */
@SpringBootApplication
@MapperScan("vip.aquan.multidatasourcedemo.mapper")
public class DynamicdatasourcedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicdatasourcedemoApplication.class, args);
    }

}
