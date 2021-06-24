package com.infy.megamart.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.megamart.common.Status;
import com.infy.megamart.dao.AccountRepository;
import com.infy.megamart.data.Account;
import com.infy.megamart.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	AccountRepository accountRepository;

	@Override
	public Status checkValidUser(String username, String userpassword) {

		
		Account accountData=accountRepository.findById(username).get();
		
		if(accountData!=null){
			if (username.equals(accountData.getUsername()) && userpassword.equals(accountData.getPassword())) {
				return Status.SUCCESS;
			}
			else {
				return Status.USERNAME_OR_PASSWORD_INCORRECT;
			}
			
		}
		else {
			return Status.USERNAME_OR_PASSWORD_INCORRECT;
		}
	}

}
