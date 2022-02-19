package com.momra.rest.services;

import java.util.List;

import com.momra.rest.model.entities.Customer;

public interface CustomerService {

	public Customer findCustomerById(Long id);
	public List<Customer> finAll();
	public Customer saveCustomer(Customer customer);
	
}
