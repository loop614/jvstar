package com.loop614.jvstar.rating.controller;

import com.loop614.jvstar.rating.RatingService;
import com.loop614.jvstar.rating.entity.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class RatingController {
    private final RatingService ratingFacade;

    @Autowired
    public RatingController(RatingService ratingFacade) {
        this.ratingFacade = ratingFacade;
    }

    @GetMapping("/rating")
    public Iterable<Rating> index() {
        return this.ratingFacade.findAll();
    }

    @GetMapping("/rating/{ratingId}")
    public Optional<Rating> index(@PathVariable("ratingId") Integer id) {
        return this.ratingFacade.findById(id);
    }

    @PostMapping("/rating/new")
    public Rating index(@RequestBody Rating rating) {
        return this.ratingFacade.save(rating);
    }
}
