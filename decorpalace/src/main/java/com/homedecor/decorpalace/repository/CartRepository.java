package com.homedecor.decorpalace.repository;


import com.homedecor.decorpalace.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {
}
