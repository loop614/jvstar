package com.loop614.jvstar.rating;

import com.loop614.jvstar.rating.entity.Rating;

import java.util.Optional;

public interface RatingService {
    Optional<Rating> findById(Integer id);

    Iterable<Rating> findAll();

    Rating save(Rating newRating);
}
