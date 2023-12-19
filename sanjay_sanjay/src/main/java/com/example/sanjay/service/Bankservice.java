package com.example.sanjay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sanjay.modal.Bank;
import com.example.sanjay.repository.Bankrepo;

@Service
public class Bankservice {
	@Autowired
	private Bankrepo Ban; 
	
	public Bank saveBa(Bank Ba) {
	 return Ban.save(Ba);
	}
	
	public List<Bank> getAll(){
		return Ban.findAll();
	}
	public Bank getById(Bank Ba){
		return Ban.findById(Ba.getId()).get();
	}
    public String updateBank(Bank Ba) {
    	if(Ba.getId()!=0) {
    		Bank getUp=Ban.findById(Ba.getId()).get();
    	    getUp.setName(Ba.getName());
    		getUp.setNumber(Ba.getNumber());
    	    getUp.setB_name(Ba.getB_name());
    	    Ban.save(getUp);
    	}else {
    		return"unable to find Bank";
    	}
    	return"updated successfully";
    }
    public String deleteBank(Bank Ba) {
    	if(Ba.getId()!=0) {
    		Ban.deleteById(Ba.getId());
    	}else {
    		return"unable to find Bank";
    	}
    	return"Delete sucssfully";
    }
     
    public List<Bank> coustemQuery() {
    	return Ban.FindAllSortByName();
    }
    public List<Bank> coustemQueryId() {
    	return Ban.findSortById();
  }
	}

	

	

