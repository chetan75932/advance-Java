package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController 
{
	@Autowired
	private ProductService ps;
	
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProduct()
	{
		return ResponseEntity.ok(ps.getProduct());
	}
	
	
	@PostMapping("/products")
	public ResponseEntity<String>  insertProduct(@RequestBody Product p)
	{
		ps.addnewProduct(p);
		return  ResponseEntity.ok("Data added succesfully");
	}
	
	
	@PutMapping("/product/{id}")
	public ResponseEntity<String> updateProduct(@RequestBody Product p)
	{
		ps.updateProduct(p);
		return ResponseEntity.ok("Modified successfully");
	}
	
	
	@DeleteMapping("/product/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable int id)
	{
		ps.getDltById(id);
		return ResponseEntity.ok("Deleted Succesfully");
	}
	
}
