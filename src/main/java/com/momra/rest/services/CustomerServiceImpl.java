package com.momra.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momra.rest.model.Customer;
import com.momra.rest.repositories.CustomerRespository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRespository  customerRespository;

	@Override
	public Customer findCustomerById(Long id) {
		return customerRespository.getById(id);
	}

	@Override
	public List<Customer> finAll() {
		
		return customerRespository.findAll();
	}

}
