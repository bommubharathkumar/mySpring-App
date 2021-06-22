package com.infy.megamart.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.infy.megamart.common.*;
import com.infy.megamart.data.Account;
import com.infy.megamart.service.AccountService;


@RestController
public class AccountController {
	
	@Autowired
	AccountService  accountService;
	
	@CrossOrigin()
    @PostMapping("/users/register")
    public Status registerAccount(@Valid @RequestBody Account newAccount) {
		
		
		Status s= accountService.registerAccount(newAccount);
		
		
		return s;

       
    }


}
