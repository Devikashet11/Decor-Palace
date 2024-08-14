package com.homedecor.decorpalace.repository;

import com.homedecor.decorpalace.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
