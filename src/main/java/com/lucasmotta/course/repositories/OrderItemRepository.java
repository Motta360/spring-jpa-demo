package com.lucasmotta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmotta.course.entities.Category;

public interface OrderItemRepository extends JpaRepository<Category, Long>{
	
}
