package com.cloud.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author waylon on 27/04/2017.
 */
@RestController
public class Controller {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }
}
