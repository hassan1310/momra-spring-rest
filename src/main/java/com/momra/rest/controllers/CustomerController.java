package com.momra.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.momra.rest.mapper.CustomerMapper;
import com.momra.rest.model.dto.CustomerDTO;
import com.momra.rest.services.CustomerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/customers")
@Tag(name = "Customer API",description = "This is the customer controller to expose API's to act with our customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	@Autowired
	CustomerDTO dto; 
	@Autowired
	CustomerMapper mapper;

	@GetMapping
	@Operation(summary = "This API to find all customers", description = "note note note")
	public List<CustomerDTO> finAll() {
		List<CustomerDTO> customers=mapper.mapToCustomerDTOList(customerService.finAll());
		return customers;
	}

	@GetMapping("/{id}")
	public CustomerDTO findCustomerById(@PathVariable Long id) {
		dto=mapper.mapToCustomerDto(customerService.findCustomerById(id));
		return dto;

	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO) {
		return mapper.mapToCustomerDto(customerService.saveCustomer(mapper.mapToCustomer(customerDTO)));
	}

}
