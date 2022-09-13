package com.product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.exception.ResourceNotFoundException;
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
	public Optional<Product> getData(Integer id) {
		return productRepository.findById(id);
	}

	@Override
	public Product updateProduct(Product product, Integer id) throws ResourceNotFoundException  {
		Product existingProduct=productRepository.findById(id).orElseThrow(()-> new  ResourceNotFoundException("Product" ,"Id",id));
		existingProduct.setProductBrand(product.getProductBrand());
		existingProduct.setProductCategoray(product.getProductCategoray());
		existingProduct.setProductName(product.getProductName());
		existingProduct.setProductPrice(product.getProductPrice());
		productRepository.save(existingProduct);
		return existingProduct;
	}

	@Override
	public void deleteProduct(Integer id) {
		Product existingProduct=productRepository.findById(id).orElseThrow(()-> new  ResourceNotFoundException("Product" ,"Id",id));
		productRepository.deleteById(id);
		
	}

	

	

}
