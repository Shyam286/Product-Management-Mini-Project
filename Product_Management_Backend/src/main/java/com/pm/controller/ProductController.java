package com.pm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pm.entity.Product;
import com.pm.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	public ResponseEntity<?> saveProduct(Product product){
		
		return new ResponseEntity<>(productService.saveProduct(product),HttpStatus.CREATED);
	}
	
public ResponseEntity<?> getAllProduct(){
		
		return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
	}

public ResponseEntity<?> getProductByID(@PathVariable Long id){
	
	return new ResponseEntity<>(productService.getProductById(id),HttpStatus.OK);
}

public ResponseEntity<?> deleteProduct(@PathVariable Long id){
	
	return new ResponseEntity<>(productService.deleteProduct(id),HttpStatus.OK);
}


}
