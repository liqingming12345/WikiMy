package com.example.wikimy.controller;

import com.example.wikimy.domain.Test;
import com.example.wikimy.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
//@Controller
public class TestController {

    @Value("${test.hello}")
    private String testHello;

    @Resource
    private TestService testService;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World" + testHello;
    }

    @RequestMapping("/hello/post")
    public String helloPost(String name){
        return "Hello World!Post," + name;
    }

    @RequestMapping("/test/list")
    public List<Test> list(){
        return testService.list();

    }
}
