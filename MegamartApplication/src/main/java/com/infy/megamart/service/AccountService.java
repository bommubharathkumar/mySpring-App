package com.infy.megamart.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.infy.megamart.common.Status;
import com.infy.megamart.data.Account;

@Service
public interface AccountService {

	Status registerAccount(@Valid Account newAccount);

}
