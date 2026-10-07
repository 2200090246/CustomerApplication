package com.mahesh.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahesh.customer.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
