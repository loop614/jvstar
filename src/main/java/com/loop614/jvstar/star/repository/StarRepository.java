package com.loop614.jvstar.star.repository;

import com.loop614.jvstar.rating.entity.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarRepository extends CrudRepository<Rating, Integer> {
}
