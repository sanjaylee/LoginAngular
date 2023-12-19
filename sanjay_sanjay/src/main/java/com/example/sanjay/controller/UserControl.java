package com.example.sanjay.controller;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sanjay.modal.UserModal;
import com.example.sanjay.service.Userservice;

@RestController

@RequestMapping("/form")
@CrossOrigin(origins="*")
public class UserControl<UserCredentials> {

	@Autowired
	
	
	private Userservice service;
	
	
//	@PostMapping("/reg")
//	public String register(@RequestBody UserModal user) throws Exception {
//		if(user.getEmail() !=null) {
//			service.saveUser(user);
//			return ("logil succfully  "+user.getName()+" !");
//		}else {
//		    return "this email is already create";
//		}
//	}

	
	
	 @PostMapping("/reg")
	    public String registerUser(@RequestBody UserModal userCredentials) {
		    String name = userCredentials.getName();
	        String email = userCredentials.getEmail();
	        String password = userCredentials.getPassword();

	        if (service.isEmailAvailable(email)) {
	            service.registerUser(name,email, password);
	            return "Registration successful";
	        } else {
	            return "Email already registered";
	        }
	    }
	
	 @PostMapping("/login")
	    public String login(@RequestBody UserModal user) {
	        String email = user.getEmail();
	        String password = user.getPassword();

	        if (service.validateLogin(email, password)) {
	            return "Login successful";
	        } else {
	            return "Invalid email or password";
	        }
	    }
	
	
	
	
	
	
	
	
}
