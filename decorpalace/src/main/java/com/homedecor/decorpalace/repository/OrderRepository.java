package com.homedecor.decorpalace.repository;

import com.homedecor.decorpalace.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
