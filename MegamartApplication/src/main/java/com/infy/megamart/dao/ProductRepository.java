package com.infy.megamart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.megamart.data.Product;


public interface ProductRepository extends JpaRepository<Product, String> { 

}
