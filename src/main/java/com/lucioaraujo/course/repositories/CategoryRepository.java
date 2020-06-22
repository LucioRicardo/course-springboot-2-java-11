package com.lucioaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucioaraujo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
