package com.loop614.jvstar.star;

import com.loop614.jvstar.star.entity.Star;
import com.loop614.jvstar.star.repository.StarRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StarServiceImpl implements StarService {
    private final StarRepository starRepository;

    public StarServiceImpl(StarRepository starRepository) {
        this.starRepository = starRepository;
    }

    public Optional<Star> findById(Integer id) {
        return this.starRepository.findById(id);
    }

    public Iterable<Star> findAll() {
        return this.starRepository.findAll();
    }

    public Star save(Star star) {
        return this.starRepository.save(star);
    }
}
