package com.niit.shopping.service;

import java.util.List;

import com.niit.shopping.model.ProductDetails;


public interface ProductService {
	public void addProduct(ProductDetails productDetails);
	public void updateProduct(ProductDetails productDetails);
	public List<ProductDetails> listProducts();
	public ProductDetails getProductById(int product_id);
	public void removeProduct(int product_id);
	public List<ProductDetails> listBrands();
	public List<ProductDetails> getProductByBrand(String product_brand);
	public List<ProductDetails> getViewProductById(int product_id);
	
}
