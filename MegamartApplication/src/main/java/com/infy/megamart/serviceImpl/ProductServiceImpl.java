package com.infy.megamart.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.megamart.common.Status;
import com.infy.megamart.dao.ProductRepository;
import com.infy.megamart.data.Account;
import com.infy.megamart.data.Product;
import com.infy.megamart.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@Override
	public Product searchProduct(String productId) {
		return productRepository.findById(productId).get();
	}

	@Override
	public Status updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Status createProduct(Product product) {

		 List<Product> products = productRepository.findAll();

	        for (Product productFromList : products) {
	            if (productFromList.getProductId().equals(product.getProductId())) {
	                System.out.println("Product Already exists!");
	                return Status.PRODUCT_ALREADY_EXISTS;
	            }
	        }

	        productRepository.save(product);
	        return Status.SUCCESS;
	}
	
}
