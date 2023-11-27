package com.loop614.jvstar.star.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarController {
    @GetMapping("/star/")
    public String index() {
        return "Hello !";
    }
}
