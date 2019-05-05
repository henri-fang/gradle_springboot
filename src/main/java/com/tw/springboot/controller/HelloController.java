package com.tw.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloController {

    @GetMapping("/hello")
    public String helloGradle() {
        return "Hello Gradle!";
    }

    @PostMapping("/custom")
    public String custom() {
        return "custom";
    }
}
