package com.infy.megamart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infy.megamart.data.WishList;

public interface WishListRepository  extends JpaRepository<WishList, String> {

}
