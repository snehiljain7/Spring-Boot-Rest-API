package com.learning.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.springrest.dao.ProductRepository;
import com.learning.springrest.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProduct(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
		return product;
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
		return product;
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);

	}


}
