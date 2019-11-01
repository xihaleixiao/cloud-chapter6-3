package com.xhlx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xhlx
 * @date 2019/11/1 10:48
 * @description
 **/
@RestController
public class RibbonController {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @GetMapping("/testRibbon")
    public String testRibbon() {
        ServiceInstance instance = loadBalancer.choose("stores");
        return instance.getHost() + ":" + instance.getPort();
    }
}
