/**
 * 
 */
package com.product.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.core.serializer.Serializer;

/**
 * @author sfjbs
 *
 */

@Entity
public class Product implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	private String productName;
	private Integer productPrice;
	private String productBrand;
	private String productCategoray ;
	
	
	
	public Product() {
		super();
	}
	
	
	public Product(Integer productId, String productName, Integer productPrice, String productBrand,
			String productCategoray) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
		this.productCategoray = productCategoray;
	}


	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public String getProductCategoray() {
		return productCategoray;
	}
	public void setProductCategoray(String productCategoray) {
		this.productCategoray = productCategoray;
	}
	
	

}
