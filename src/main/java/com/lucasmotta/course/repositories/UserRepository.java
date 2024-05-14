package com.lucasmotta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmotta.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
