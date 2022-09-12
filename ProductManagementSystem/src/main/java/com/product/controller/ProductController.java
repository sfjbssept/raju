package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.IProductService;

@RestController
public class ProductController {
	
	@Autowired
	private IProductService iProductService;
	
	@PostMapping("/addProduct")
	Integer addProduct(@RequestBody Product product) {
		
		Integer productId= iProductService.addProduct(product);
		System.out.println("Product id:-"+productId);
		return productId;
		
	}
	
	@GetMapping("/getAllproduct")
	List<Product> getAllProduct() {
		return  iProductService.getAllProduct();
	}
	
	@GetMapping("getData/{id}")
	Product getDataBasedOnId(@PathVariable (value= "id")Integer id) {
		
		return iProductService.getData(id);
		
	}
	
	
	
}
