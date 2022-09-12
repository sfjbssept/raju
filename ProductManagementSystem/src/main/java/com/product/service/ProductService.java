package com.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Integer addProduct(Product product) {
		Product addedProduct = productRepository.save(product);
		return addedProduct.getProductId();
	}

	@Override
	public List<Product> getAllProduct() {
	
				return productRepository.findAll();
	}

	@Override
	public Product getData(Integer id) {
		return productRepository.getById(id);
	}

	

}
