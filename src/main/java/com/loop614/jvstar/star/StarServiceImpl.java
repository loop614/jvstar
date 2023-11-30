package com.loop614.jvstar.star;

import com.loop614.jvstar.rating.entity.Rating;
import com.loop614.jvstar.star.domain.editor.StarEditor;
import com.loop614.jvstar.star.entity.Star;
import com.loop614.jvstar.star.repository.StarRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StarServiceImpl implements StarService {
    private final StarEditor starEditor;
    private final StarRepository starRepository;

    public StarServiceImpl(
        StarEditor starEditor,
        StarRepository starRepository
    ) {
        this.starEditor = starEditor;
        this.starRepository = starRepository;
    }

    public Optional<Star> findStar(String userId, String objectId) {
        return this.starRepository.findByUserIdAndObjectId(userId, objectId);
    }

    public Star updateStar(Rating rating) {
        return this.starEditor.updateStarByRating(rating);
    }
}
