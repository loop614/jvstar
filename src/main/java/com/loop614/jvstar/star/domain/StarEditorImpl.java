package com.loop614.jvstar.star.domain;

import com.loop614.jvstar.rating.entity.Rating;
import com.loop614.jvstar.star.entity.Star;
import com.loop614.jvstar.star.repository.StarRepository;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Optional;

@Component
public class StarEditorImpl implements StarEditor {
    private final StarRepository starRepository;

    public StarEditorImpl(StarRepository starRepository) {
        this.starRepository = starRepository;
    }

    public Star updateStarByRating(Rating rating) {
        Optional<Star> starOptional = this.starRepository.
                findByUserIdAndObjectId(rating.getUserId(), rating.getObjectId());

        Star star = starOptional.orElseGet(Star::new);

        BigDecimal oldValue = star.getValue();
        if (oldValue == null) {
            oldValue = BigDecimal.valueOf(0.0);
        }
        Long oldCount = star.getCount() == null ? 0 : star.getCount();
        Long newCount = oldCount + 1;

        BigDecimal newValue = ((oldValue.multiply(BigDecimal.valueOf(oldCount)))
            .add(rating.getValue()))
            .divide(BigDecimal.valueOf(newCount));

        star.setCount(newCount);
        star.setValue(newValue);

        if (star.getId() == 0) {
            star.setObjectId(rating.getObjectId());
            star.setUserId(rating.getUserId());
        }

        return this.starRepository.save(star);
    }
}
