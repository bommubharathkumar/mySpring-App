package com.infy.megamart.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.infy.megamart.common.*;
import com.infy.megamart.data.Product;
import com.infy.megamart.service.ProductService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/getAllProducts", method=RequestMethod.GET)
	public  List<Product> getAllProducts() {
		List<Product> products = productService.getAll();
		return products;
	}
	@RequestMapping(value="/searchProduct/{productId}", method=RequestMethod.GET)
	public Product searchProduct(@PathVariable String productId) {
		Product product = productService.searchProduct(productId);
		return product;
	}

	
	
	@RequestMapping(value = "/updateProduct", method = RequestMethod.PUT)
	public Status updateProduct(@RequestBody Product product) {
		Status result=	productService.updateProduct(product);
		return result;
	}

	
	@RequestMapping(value = "/createProduct", method = RequestMethod.POST)
	public Status createProduct(@RequestBody Product product) {
		Status result=	productService.createProduct(product);
		return result;
	}
}
