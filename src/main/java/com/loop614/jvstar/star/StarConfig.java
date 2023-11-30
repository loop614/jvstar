package com.loop614.jvstar.Star;

import com.loop614.jvstar.star.entity.Star;
import com.loop614.jvstar.star.StarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarConfig {
    @Bean
    CommandLineRunner starCommandLineRunner(StarService starService) {
        return args -> {
            Star newStar = new Star(
                "Star"
            );
            Star savedStar = starService.save(newStar);
            System.out.println("new Star created with id " + savedStar.getId());
        };
    }
}
