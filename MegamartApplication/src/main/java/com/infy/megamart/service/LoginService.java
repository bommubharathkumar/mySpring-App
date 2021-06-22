package com.infy.megamart.service;

import org.springframework.stereotype.Service;

import com.infy.megamart.common.Status;


@Service
public interface LoginService {

	Status checkValidUser(String username, String userpassword);



}
