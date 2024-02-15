package com.loop614.jvstar.star.repository;

import com.loop614.jvstar.star.entity.Star;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StarRepository extends CrudRepository<Star, Integer> {
    Optional<Star> findByUserIdAndObjectId(String userId, String objectId);
}
