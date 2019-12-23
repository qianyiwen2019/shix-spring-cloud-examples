package com.example.springcloudzookeeperproducer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shicai.xsc 2019/11/10 下午9:14
 * @desc
 * @since 5.0.0.0
 */
@RestController
public class HelloWorld3Controller {
    @GetMapping("/helloworld3")
    public String HelloWorld3() {
        return "Hello World 3!";
    }
}