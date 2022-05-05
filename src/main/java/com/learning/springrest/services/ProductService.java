package com.learning.springrest.services;

import java.util.List;

import com.learning.springrest.entities.Product;

public interface ProductService {

	public List<Product> getProducts();
	public Product getProduct(int id);
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public void deleteProduct(int id);
	
}
