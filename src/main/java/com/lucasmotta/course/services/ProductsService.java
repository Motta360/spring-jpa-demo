package com.lucasmotta.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucasmotta.course.entities.Products;
import com.lucasmotta.course.repositories.ProductsRepository;
@Service
public class ProductsService {
	@Autowired
	private ProductsRepository repository;
	
	public List<Products> findAll() {
		return repository.findAll();
	}
	
	public Products findById(Long id) {
		Optional<Products> obj = repository.findById(id);
		return obj.get();
		
	}
}