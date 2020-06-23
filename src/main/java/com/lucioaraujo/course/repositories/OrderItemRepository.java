package com.lucioaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucioaraujo.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
