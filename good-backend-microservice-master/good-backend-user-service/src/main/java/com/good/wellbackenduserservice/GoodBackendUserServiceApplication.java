package com.good.wellbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.good.wellbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.good")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.good.wellbackendserviceclient.service"})
public class GoodBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodBackendUserServiceApplication.class, args);
    }

}
