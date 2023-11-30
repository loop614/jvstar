package com.loop614.jvstar.star.controller;

import com.loop614.jvstar.star.StarService;
import com.loop614.jvstar.star.entity.Star;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StarController {
    private final StarService starService;

    @Autowired
    public StarController(StarService starService) {
        this.starService = starService;
    }

    @GetMapping("/star/user/{userId}/object/{objectId}")
    public Optional<Star> index(
            @PathVariable("userId") String userId,
            @PathVariable("objectId") String objectId
    ) {
        return this.starService.findStar(userId, objectId);
    }
}
