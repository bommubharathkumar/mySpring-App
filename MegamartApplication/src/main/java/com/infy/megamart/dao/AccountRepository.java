package com.infy.megamart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.megamart.data.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {
}