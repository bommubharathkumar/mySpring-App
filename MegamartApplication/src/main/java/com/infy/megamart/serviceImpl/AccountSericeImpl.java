package com.infy.megamart.serviceImpl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.megamart.common.Status;
import com.infy.megamart.dao.AccountRepository;
import com.infy.megamart.data.Account;
import com.infy.megamart.service.AccountService;

@Service
public class AccountSericeImpl  implements AccountService{
	
	@Autowired
	AccountRepository accountRepository;

	@Override
	public Status registerAccount(Account newAccount) {
		
		
		Account accounts=accountRepository.getById(newAccount.getUsername());
	
		
		
	            if (accounts.getUsername().equals(newAccount.getUsername())) {
	                System.out.println("User Already exists!");
	                return Status.USER_ALREADY_EXISTS;
	            }
	        

	            accountRepository.save(newAccount);
	        return Status.SUCCESS;
	}

}
