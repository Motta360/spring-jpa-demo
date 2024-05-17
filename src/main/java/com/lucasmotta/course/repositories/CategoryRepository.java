package com.lucasmotta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmotta.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
