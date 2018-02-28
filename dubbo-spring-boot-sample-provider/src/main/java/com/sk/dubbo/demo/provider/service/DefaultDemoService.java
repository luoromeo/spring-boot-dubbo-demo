package com.sk.dubbo.demo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sk.dubbo.demo.consumer.DemoService;

/**
 * description:
 * author: romeo
 * date: 2018/2/28 0028
 */
@Service(
        version = "1.0.0"
)
public class DefaultDemoService implements DemoService {

    public String sayHello(String name) {
        return "Hello, " + name + " (from Spring Boot)";
    }

}