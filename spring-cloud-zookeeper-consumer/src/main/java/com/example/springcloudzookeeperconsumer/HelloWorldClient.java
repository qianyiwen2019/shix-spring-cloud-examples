package com.example.springcloudzookeeperconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shicai.xsc 2019/11/10 上午2:03
 * @desc
 * @since 5.0.0.0
 */
@Configuration
@EnableFeignClients
@EnableDiscoveryClient
public class HelloWorldClient {
    @Autowired
    private TheClient theClient;

    @FeignClient(name = "HelloWorld")
    interface TheClient {

        @RequestMapping(path = "/helloworld", method = RequestMethod.GET)
        @ResponseBody
        String HelloWorld();
    }

    public String HelloWorld() {
        return theClient.HelloWorld();
    }
}