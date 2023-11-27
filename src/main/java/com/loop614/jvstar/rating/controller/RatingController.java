package com.loop614.jvstar.rating.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {
    @GetMapping("/rating/")
    public String index() {
        return "Hello !";
    }
}
