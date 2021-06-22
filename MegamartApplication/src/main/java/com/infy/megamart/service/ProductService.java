package com.infy.megamart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infy.megamart.common.Status;
import com.infy.megamart.data.Product;

@Service
public interface ProductService {

	List<Product> getAll();

	Product searchProduct(String productId);

	Status updateProduct(Product product);

	Status createProduct(Product product);

}
