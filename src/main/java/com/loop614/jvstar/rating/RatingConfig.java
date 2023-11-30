package com.loop614.jvstar.rating;

import com.loop614.jvstar.rating.entity.Rating;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RatingConfig {
    @Bean
    CommandLineRunner ratingCommandLineRunner(RatingService ratingService) {
        return args -> {
            Rating newRating = new Rating(4.2, "1", "1", "1");
            Rating savedRating = ratingService.save(newRating);
            System.out.println("new rating created with id " + savedRating.getId());
            Rating newRating2 = new Rating(2.1, "1", "2", "1");
            Rating savedRating2 = ratingService.save(newRating2);
            System.out.println("new rating created with id " + savedRating2.getId());
        };
    }
}
