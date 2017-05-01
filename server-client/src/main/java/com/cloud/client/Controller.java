package com.cloud.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author waylon on 27/04/2017.
 */
@RestController
public class Controller {

//    @Value("${model}")
//    private String model;

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloWorld() {
        return "hello client";
    }
}
