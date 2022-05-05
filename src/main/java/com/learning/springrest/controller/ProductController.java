package com.learning.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springrest.entities.Product;
import com.learning.springrest.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable int id){
		return productService.getProduct(id);
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return this.productService.addProduct(product);
	}
	
	@PutMapping("/products")
	public Product updateProduct(Product product) {
		return this.productService.updateProduct(product);
	}
	
	@DeleteMapping("/products/{id}")
	public void deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
	}
	
}
