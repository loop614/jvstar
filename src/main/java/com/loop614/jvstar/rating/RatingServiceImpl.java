package com.loop614.jvstar.rating;

import com.loop614.jvstar.rating.entity.Rating;
import com.loop614.jvstar.rating.repository.RatingRepository;
import com.loop614.jvstar.star.StarService;
import org.springframework.stereotype.Service;

@Service
public class RatingServiceImpl implements RatingService {
    private final StarService starService;
    private final RatingRepository ratingRepository;

    public RatingServiceImpl(
        StarService starService,
        RatingRepository ratingRepository
    ) {
        this.starService = starService;
        this.ratingRepository = ratingRepository;
    }

    public Rating save(Rating rating) {
        Rating newRating = this.ratingRepository.save(rating);
        starService.updateStar(newRating);

        return newRating;
    }
}
