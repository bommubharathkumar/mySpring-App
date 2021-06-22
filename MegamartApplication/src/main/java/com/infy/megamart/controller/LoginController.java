package com.infy.megamart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.infy.megamart.common.*;
import com.infy.megamart.service.LoginService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	LoginService loginService;
	@RequestMapping(value="/checkValidUser/{username},{userpassword}", method=RequestMethod.GET)
	 public Status checkValidUser(@PathVariable String username,@PathVariable String userpassword) {
        Status result = loginService.checkValidUser(username,userpassword);
        return  result;
       
	}
    }
