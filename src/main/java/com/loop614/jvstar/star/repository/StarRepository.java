package com.loop614.jvstar.star.repository;

import com.loop614.jvstar.star.entity.Star;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarRepository extends CrudRepository<Star, Integer> {
}
