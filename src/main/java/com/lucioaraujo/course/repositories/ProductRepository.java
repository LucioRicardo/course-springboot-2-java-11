package com.lucioaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucioaraujo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
