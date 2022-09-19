package com.airlinq.Project_Informica.service.product_service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.airlinq.Project_Informica.entities.Products;

@Service
public interface ProductDetailsService {

	public ResponseEntity<List<Products>> getAllProductDetails();
	
	public ResponseEntity<Products> getProductDetails(String product_Id);
	
	public ResponseEntity<Products> addProductDetails(Products productDetails);
	
	public ResponseEntity<String> deleteProductDetails(String productId);
}