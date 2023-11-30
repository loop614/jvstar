package com.loop614.jvstar.rating;

import com.loop614.jvstar.rating.entity.Rating;
import com.loop614.jvstar.rating.repository.RatingRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RatingServiceImpl implements RatingService {
    private final RatingRepository ratingRepository;

    public RatingServiceImpl(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public Optional<Rating> findById(Integer id) {
        return this.ratingRepository.findById(id);
    }

    public Iterable<Rating> findAll() {
        return this.ratingRepository.findAll();
    }

    public Rating save(Rating rating) {
        return this.ratingRepository.save(rating);
    }
}
