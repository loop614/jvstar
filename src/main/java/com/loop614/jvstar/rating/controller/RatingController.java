package com.loop614.jvstar.rating.controller;

import com.loop614.jvstar.rating.RatingService;
import com.loop614.jvstar.rating.entity.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RatingController {
    private final RatingService ratingService;

    @Autowired
    public RatingController(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    @PostMapping("/rating/new")
    public Rating index(@RequestBody Rating rating) {
        return this.ratingService.save(rating);
    }
}
