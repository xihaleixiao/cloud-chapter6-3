package com.xhlx.hystrix;

import com.xhlx.EurekaClientFeign;
import org.springframework.stereotype.Component;

/**
 * @author xhlx
 * @date 2019/11/1 15:39
 * @description
 **/
@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
