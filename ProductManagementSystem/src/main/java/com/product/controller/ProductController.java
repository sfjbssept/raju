package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.product.service.IProductService;

@RestController
public class ProductController {
	
	@Autowired
	IProductService iProductService;
	
	public String getAllProduct() {
		
		return iProductService.getAllProduct();
	}

}
