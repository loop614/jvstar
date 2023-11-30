package com.loop614.jvstar.star.domain.editor;

import com.loop614.jvstar.rating.entity.Rating;
import com.loop614.jvstar.star.entity.Star;
import com.loop614.jvstar.star.repository.StarRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class StarEditorImpl implements StarEditor {
    private final StarRepository starRepository;

    public StarEditorImpl(StarRepository starRepository) {
        this.starRepository = starRepository;
    }

    public Star updateStarByRating(Rating rating) {
        Optional<Star> starOptional = this.starRepository.
                findByUserIdAndObjectId(rating.getUserId(), rating.getObjectId());

        Star star = starOptional.orElseGet(Star::new);

        Double oldValue = star.getValue();
            if (oldValue == null) {
            oldValue = 0.0;
        }
        Integer oldCount = star.getCount() == null ? 0 : star.getCount();
        Integer newCount = oldCount + 1;

        Double newValue = ((oldValue * oldCount) + rating.getValue()) / newCount;
            star.setCount(newCount);
            star.setValue(newValue);

            if (star.getId() == 0) {
            star.setObjectId(rating.getObjectId());
            star.setUserId(rating.getUserId());
        }

        return this.starRepository.save(star);
    }
}
