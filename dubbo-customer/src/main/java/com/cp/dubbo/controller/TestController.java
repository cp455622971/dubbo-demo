package com.cp.dubbo.controller;

import com.cp.dubbo.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @className: TestController
 * @description: TODO 类描述
 * @author: cp
 * @date: 2021-08-19
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam String name){
        return testService.doSomething(name).getName();
    }
}
