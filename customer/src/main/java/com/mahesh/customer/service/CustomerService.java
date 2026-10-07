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
	Customer updateAllCustomers();
	//update one customer using id
	Customer updateCustomer(int id);
	//delete customer using id
	void deleteCustomer(int id);
}
