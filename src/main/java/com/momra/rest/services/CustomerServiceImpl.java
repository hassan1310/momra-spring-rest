package com.momra.rest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.momra.rest.model.entities.Customer;
import com.momra.rest.repositories.CustomerRespository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRespository  customerRespository;

	@Override
	public Customer findCustomerById(Long id) {
		return customerRespository.findById(id).get();
	}

	@Override
	public List<Customer> finAll() {
		//List <Customer> list= new ArrayList<>(); 
		//customerRespository.findAll().forEach(list::add);
		return customerRespository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerRespository.save(customer);
	}

}
