package com.example.springcloudzookeeperproducer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shicai.xsc 2019/11/10 上午1:54
 * @desc
 * @since 5.0.0.0
 */
@RestController
public class HelloWorldController {
    @GetMapping("/helloworld")
    public String HelloWorld() {
        return "Hello World!";
    }

    @GetMapping("/helloworld2")
    public String HelloWorld2() {
        return "Hello World 2!";
    }
}