package com.loop614.jvstar.star.domain.editor;

import com.loop614.jvstar.rating.entity.Rating;
import com.loop614.jvstar.star.entity.Star;

public interface StarEditor {
    Star updateStarByRating(Rating rating);
}
