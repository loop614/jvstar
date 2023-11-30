package com.loop614.jvstar.rating;

import com.loop614.jvstar.rating.entity.Rating;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RatingConfig {
    @Bean
    CommandLineRunner ratingCommandLineRunner(RatingService ratingFacade) {
        return args -> {
            Rating newRating = new Rating(
                "rating"
            );
            Rating savedRating = ratingFacade.save(newRating);
            System.out.println("new rating created with id " + savedRating.getId());
        };
    }
}
