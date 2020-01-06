package com.example.second;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/test")


public class Test {
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
