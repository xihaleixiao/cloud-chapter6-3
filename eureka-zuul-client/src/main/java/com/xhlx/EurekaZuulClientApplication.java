package com.xhlx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author xhlx
 * @date 2019/11/4 9:20
 * @description
 **/
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class EurekaZuulClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulClientApplication.class, args);
    }
}
