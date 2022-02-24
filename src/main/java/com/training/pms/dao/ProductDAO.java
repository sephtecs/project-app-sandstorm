package com.training.pms.dao;

import java.util.List;

import com.training.pms.model.Product;

public interface ProductDAO {
	
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(int productId);
	public Product searchProductId(int productId);
	public List<Product> searchProductName(String productName);
	public List<Product> searchProductPrice(int lowerPrice, int upperPrice);
	public List<Product> printAllProducts();
	
	public boolean isProductExists(int productId);

}
