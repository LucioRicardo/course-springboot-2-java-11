package com.lucioaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucioaraujo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
