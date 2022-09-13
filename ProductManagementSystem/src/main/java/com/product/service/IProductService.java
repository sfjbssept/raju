package com.product.service;

import java.util.List;
import java.util.Optional;

import com.product.entity.Product;

public interface IProductService {

	Integer addProduct(Product product);

	 List<Product> getAllProduct();

	Optional<Product> getData(Integer id); 
	
	Product updateProduct(Product product,Integer id);
	
	void deleteProduct(Integer id);

}
