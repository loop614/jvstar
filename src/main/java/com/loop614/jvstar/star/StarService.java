package com.loop614.jvstar.star;

import com.loop614.jvstar.star.entity.Star;

import java.util.Optional;

public interface StarService {
    Optional<Star> findById(Integer id);

    Iterable<Star> findAll();

    Star save(Star newStar);
}
