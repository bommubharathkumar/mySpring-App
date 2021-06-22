package com.infy.megamart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.megamart.data.Cart;

public interface OrderRepository  extends JpaRepository<Cart, String> {

}
