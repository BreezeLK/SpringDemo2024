package com.breeze.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.breeze.spring.bean")
public class MyBeanConfig {

    @Bean(name = "emp")
    public Emp initEmp() {
        return new Emp("1", "1", "1", 1);
    }

}
