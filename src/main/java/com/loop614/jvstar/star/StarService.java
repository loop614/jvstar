package com.loop614.jvstar.star;

import com.loop614.jvstar.rating.entity.Rating;
import com.loop614.jvstar.star.entity.Star;

import java.util.Optional;

public interface StarService {
    Optional<Star> findStar(String userId, String objectId);
    Star updateStar(Rating rating);
}
