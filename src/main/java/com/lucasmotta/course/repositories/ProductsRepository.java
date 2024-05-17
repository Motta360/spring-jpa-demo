package com.lucasmotta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasmotta.course.entities.Products;

public interface ProductsRepository extends JpaRepository<Products, Long>{
	
}
