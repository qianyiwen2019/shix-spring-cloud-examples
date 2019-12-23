package com.example.springcloudzookeeperconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shicai.xsc 2019/11/10 上午1:58
 * @desc
 * @since 5.0.0.0
 */
@RestController
public class GreetingController {
    @Autowired
    private HelloWorldClient helloWorldClient;

    @GetMapping("/get-greeting")
    public String greeting() {

        return helloWorldClient.HelloWorld();

    }
}