package com.loop614.jvstar.rating.repository;

import com.loop614.jvstar.rating.entity.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends CrudRepository<Rating, Integer> {
}
