package com.mahesh.customer.service;

import java.util.List;


import com.mahesh.customer.model.Customer;

public interface CustomerService {
	//insert Customerdata into database
	Customer createCustomer(Customer c);
	//get all customerdata
	List<Customer> getAllCustomers();
	//get only one customerdata using id
	Customer getCustomer(int id);
	//update all customers
	Customer updateData(Customer c);
	//delete customer using id
	void deleteCustomer(int id);
}
