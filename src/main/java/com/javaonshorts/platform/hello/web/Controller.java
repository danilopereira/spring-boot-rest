package com.javaonshorts.platform.hello.web;

import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(method = RequestMethod.GET, value = "/helloWorld")
    public String helloWorld(){
        return "Hello World!";
    }
}
