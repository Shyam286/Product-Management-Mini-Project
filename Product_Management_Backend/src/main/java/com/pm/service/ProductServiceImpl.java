package com.pm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.pm.entity.Product;
import com.pm.repository.ProductRepository;

public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product saveProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		
		return productRepository.findById(id).get();
	}

	@Override
	public void deleteProduct(Long id) {
		
		Product product = productRepository.findById(id).get();
		if(product != null)
			productRepository.deleteById(id);
	}

}
