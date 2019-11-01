package com.xhlx;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xhlx
 * @date 2019/11/1 15:17
 * @description
 **/
@Configuration
public class FeignConfig {

    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default(100, 1000, 5);
    }
}
