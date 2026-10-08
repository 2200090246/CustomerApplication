package com.mahesh.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahesh.customer.model.Customer;
import com.mahesh.customer.service.CustomerService;

@RestController
@RequestMapping("/")
public class CustomerController {
	@Autowired
	CustomerService customer;

	@PostMapping("/insert")
	Customer CreateCustomerInfo( @RequestBody Customer c) {
		return customer.createCustomer(c);
	}

}
