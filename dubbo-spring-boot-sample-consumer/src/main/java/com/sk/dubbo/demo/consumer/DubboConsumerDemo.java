package com.sk.dubbo.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description:
 * author: romeo
 * date: 2018/2/28 0028
 */
@SpringBootApplication(scanBasePackages = "com.sk.dubbo.demo.consumer.controller")
public class DubboConsumerDemo {

    public static void main(String[] args) {

        SpringApplication.run(DubboConsumerDemo.class,args);

    }

}