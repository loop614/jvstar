package com.loop614.jvstar.star;

import com.loop614.jvstar.rating.entity.Rating;
import com.loop614.jvstar.star.entity.Star;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StarServiceImpl implements StarService {
    private final StarFactory starFactory;

    public StarServiceImpl(StarFactory starFactory) {
        this.starFactory = starFactory;
    }

    public Optional<Star> findStar(String userId, String objectId) {
        return this.starFactory.getStarRepository().findByUserIdAndObjectId(userId, objectId);
    }

    public Star updateStar(Rating rating) {
        return this.starFactory
            .createStarEditor()
            .updateStarByRating(rating);
    }
}
