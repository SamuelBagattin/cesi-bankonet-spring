package com.cesi.bankonet.controllers;

import com.cesi.bankonet.models.Customer;
import com.cesi.bankonet.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/customers")
public class CustomersController {
	@Autowired
	private CustomersRepository customersRepository;

	@GetMapping
	public @ResponseBody
	Iterable<Customer> getAllUsers() {
		// This returns a JSON or XML with the users
		return customersRepository.findAll();
	}

}


