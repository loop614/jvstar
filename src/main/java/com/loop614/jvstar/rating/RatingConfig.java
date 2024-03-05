package com.loop614.jvstar.rating;

import com.loop614.jvstar.rating.entity.Rating;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RatingConfig {
    @Bean
    CommandLineRunner ratingCommandLineRunner(RatingService ratingService) {
        return args -> {
            Rating newRating = new Rating(BigDecimal.valueOf(4.2), "1", "1", "1");
            Rating savedRating = ratingService.save(newRating);
            System.out.println("new rating created with id " + savedRating.getId());
            newRating = new Rating(BigDecimal.valueOf(2.1), "1", "2", "1");
            savedRating = ratingService.save(newRating);
            System.out.println("new rating created with id " + savedRating.getId());
        };
    }
}
