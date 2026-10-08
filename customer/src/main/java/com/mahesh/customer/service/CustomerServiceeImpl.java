package com.mahesh.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahesh.customer.model.Customer;
import com.mahesh.customer.repo.CustomerRepo;

@Service
public class CustomerServiceeImpl implements CustomerService {
	@Autowired
	CustomerRepo customer;

	@Override
	public Customer createCustomer(Customer c) {
		// TODO Auto-generated method stub
		return customer.save(c);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customer.findAll();
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return customer.findById(id).orElse(null);
	}

	@Override
	public Customer updateData(Customer c) {
		// TODO Auto-generated method stub
		return customer.save(c);
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customer.deleteById(id);

	}

}
