package com.loop614.jvstar.star;

import com.loop614.jvstar.rating.entity.Rating;
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

    public Optional<Star> findStar(String userId, String objectId) {
        return this.starRepository.findByUserIdAndObjectId(userId, objectId);
    }

    public Star updateStar(Rating rating) {
        Optional<Star> starOptional = this.starRepository.findByUserIdAndObjectId(rating.getUserId(), rating.getObjectId());
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
