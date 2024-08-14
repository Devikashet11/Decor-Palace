package com.homedecor.decorpalace.repository;

import com.homedecor.decorpalace.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
