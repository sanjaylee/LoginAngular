package com.example.sanjay.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sanjay.modal.UserModal;
import com.example.sanjay.repository.UserRepo;

@Service

public class Userservice {

	@Autowired
	
	private UserRepo repo;
	
//	public UserModal saveUser(UserModal user) {
//		return repo.save(user);
//	}
	
	
	
	
	 public boolean isEmailAvailable(String email) {
	        // Check if the email is not already registered
	        return repo.findByEmail(email) == null;
	    }

	 
	 
	    public UserModal registerUser(String name, String email, String password) {
	        // Perform additional validations if needed

	        // Create and save the new user
	        UserModal newUser = new UserModal();
	       newUser.setName(name);
	        newUser.setEmail(email);
	        newUser.setPassword(password); // Note: In a real application, you should hash the password
	        return repo.save(newUser);
	    }
	
	    
	    
	    
	    
	 public boolean validateLogin(String email, String password) {
	        UserModal user = repo.findByEmail(email);

	        // Check if the user exists and the password matches
	        return user != null && user.getPassword().equals(password);
	    }

	
	
}
