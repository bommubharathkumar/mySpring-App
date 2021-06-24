package com.infy.megamart.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.megamart.common.Status;
import com.infy.megamart.dao.AccountRepository;
import com.infy.megamart.data.Account;
import com.infy.megamart.service.AccountService;


@Service
public class AccountSericeImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;

	@Override
	public Status registerAccount(Account newAccount) {
		
		
		 List<Account> accounts = accountRepository.findAll();

	        for (Account account : accounts) {
	            if (account.getUsername().equals(newAccount.getUsername())) {
	                System.out.println("Account Already exists!");
	                return Status.USER_ALREADY_EXISTS;
	            }
	        }

	        accountRepository.save(newAccount);
	        return Status.SUCCESS;
	}
}
