package com.pm.service;

import java.util.List;

import com.pm.entity.Product;

public interface ProductService {

	public Product saveProduct(Product product);
	
	public  List<Product> getAllProducts();
	
	public Product getProductById(Long id);
	
	public void deleteProduct(Long id);
}
