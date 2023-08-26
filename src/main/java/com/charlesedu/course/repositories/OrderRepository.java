package com.charlesedu.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charlesedu.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
