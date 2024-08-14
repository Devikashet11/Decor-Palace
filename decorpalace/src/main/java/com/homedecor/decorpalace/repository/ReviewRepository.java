package com.homedecor.decorpalace.repository;

import com.homedecor.decorpalace.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
