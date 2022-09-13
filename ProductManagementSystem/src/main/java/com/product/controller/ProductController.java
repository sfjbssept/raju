package com.product.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.exception.ResourceNotFoundException;
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
	
	@GetMapping("/getData/{id}")
	Optional<Product> getDataBasedOnId(@PathVariable Integer id) {
		Optional<Product> product= iProductService.getData(id);
		return product;
		
	}
	
	@GetMapping("/getProduct/{id}")
	Optional<Product> getData(@PathParam ("id") Integer id) {
		Optional<Product> product= iProductService.getData(id);
		return product;
		
	}
	
	@PutMapping("/update/{id}")
	ResponseEntity<Product>  updateProduct(@RequestBody Product prduct,@PathVariable Integer id) throws ResourceNotFoundException {
		
		//return new ResponseEntity(iProductService.updateProduct(prduct, id),HttpStatus.OK);
		
		  if(prduct.getProductId()!=null) { return new
		  ResponseEntity(iProductService.updateProduct(prduct, id),HttpStatus.OK);
		  }else return new ResponseEntity( new ResourceNotFoundException("Product"
		  ,"Id",id), HttpStatus.NOT_FOUND);
		 
		
	}
	
	@DeleteMapping("/delete/{id}")
	ResponseEntity<Product> deleteProduct(@PathVariable  Integer id){
		
		ResponseEntity<Product> responseEntity=new ResponseEntity<Product>(HttpStatus.OK);
		
		try {
			iProductService.deleteProduct(id);
		} catch (Exception e) {
			e.printStackTrace();
			new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}
	
	
	
}
