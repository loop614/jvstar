package com.loop614.jvstar.home.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello !";
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong 2";
    }
}
