package com.loop614.jvstar.star.controller;

import com.loop614.jvstar.star.StarService;
import com.loop614.jvstar.star.entity.Star;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StarController {
    private final StarService starFacade;

    @Autowired
    public StarController(StarService starFacade) {
        this.starFacade = starFacade;
    }

    @GetMapping("/star")
    public Iterable<Star> index() {
        return this.starFacade.findAll();
    }

    @GetMapping("/star/{starId}")
    public Optional<Star> index(@PathVariable("starId") Integer id) {
        return this.starFacade.findById(id);
    }

    @PostMapping("/star/new")
    public Star index(@RequestBody Star star) {
        return this.starFacade.save(star);
    }
}
