package com.momra.rest.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.momra.rest.model.dto.CustomerDTO;
import com.momra.rest.model.entities.Customer;

@Component
public class CustomerMapper {

	
	public CustomerDTO mapToCustomerDto(Customer customer) {
		CustomerDTO dto = new CustomerDTO();
		dto.setId(customer.getId());
		dto.setFirstName(customer.getFirstName());
		dto.setLastName(customer.getLastName());
		return dto;
	}
	public Customer mapToCustomer(CustomerDTO customerDTO) {
		Customer customer= new Customer();
		customer.setFirstName(customerDTO.getFirstName());
		customer.setLastName(customerDTO.getLastName());
		return customer;
	}
	public List<CustomerDTO> mapToCustomerDTOList(List<Customer> customers) {
		List<CustomerDTO> customersDtos = new ArrayList<>();
		for (Customer cust : customers) {
			customersDtos.add(mapToCustomerDto(cust));	
		}
		return customersDtos;
	}

}
