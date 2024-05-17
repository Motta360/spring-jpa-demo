package com.lucasmotta.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasmotta.course.entities.Products;
import com.lucasmotta.course.services.ProductsService;

@RestController
@RequestMapping(value = "/products")
public class ProductsResource {
	@Autowired
	private ProductsService userService;
	@GetMapping
	public ResponseEntity<List<Products>> findAll(){
		List<Products> list = userService.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Products> findById(@PathVariable long id){
		Products obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
