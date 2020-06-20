package com.lucioaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucioaraujo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
