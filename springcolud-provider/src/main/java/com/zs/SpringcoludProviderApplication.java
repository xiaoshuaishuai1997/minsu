package com.zs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.zs.dao")
public class SpringcoludProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcoludProviderApplication.class, args);
    }

}
