package com.xhlx.controller;

import com.xhlx.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xhlx
 * @date 2019/11/1 15:23
 * @description
 **/
@RestController
public class HiController {

    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "zl", required = false) String name) {
        return hiService.sayHi(name);
    }
}
