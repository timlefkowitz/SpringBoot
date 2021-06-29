package com.SpringBootAssessment.repositories;

import com.SpringBootAssessment.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

//    List<Order> searchByTitle(@Param("Term") String Term);
//    Order findByTitle(String title);
    Order findAllByEmail(String email);

}
