package com.SpringBootAssessment.repositories;

import com.SpringBootAssessment.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
