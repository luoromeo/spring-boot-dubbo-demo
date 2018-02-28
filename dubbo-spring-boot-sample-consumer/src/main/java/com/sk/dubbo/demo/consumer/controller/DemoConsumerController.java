package com.sk.dubbo.demo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sk.dubbo.demo.consumer.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 * author: romeo
 * date: 2018/2/28 0028
 */
@RestController
public class DemoConsumerController {

    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.sayHello(name);
    }

}
