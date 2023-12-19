package com.example.sanjay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sanjay.modal.Bank;
import com.example.sanjay.service.Bankservice;

@RestController
@RequestMapping("/Bank")
public class Bankcontroller {
	@Autowired
	private Bankservice saveser;

	
	@PostMapping("/add")
	public Bank saveBank(@RequestBody Bank Ban) {
		return saveser.saveBa(Ban);
	}
	
	@GetMapping("/list")
	public List<Bank> getAllBa(){
		return saveser.getAll();
	}
	@GetMapping("/coustem")
	  public List<Bank> grtAllcoust(){
		return saveser.coustemQuery();
	}
	@GetMapping("/coustemId")
	  public List<Bank> getcoustId(){
		return saveser.coustemQueryId();
	}
	@PostMapping("/id")
	public Bank findBa(@RequestBody Bank Ban) {
		return saveser.getById(Ban);
	}
	@PutMapping("/update")
	public String updateBa(@RequestBody Bank Ban) {
		return saveser.updateBank(Ban);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestBody Bank Ban) {
		return saveser.deleteBank(Ban);
	}

}
