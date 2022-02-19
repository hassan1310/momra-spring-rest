package com.momra.rest.bootstrab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.momra.rest.model.entities.Customer;
import com.momra.rest.repositories.CustomerRespository;

@Component
public class BootStrapData  implements CommandLineRunner{

	@Autowired
	private CustomerRespository customerRespository;
	@Override
	public void run(String... args) throws Exception {
		Customer customer1 = new Customer();
		customer1.setFirstName("Hassan");
		customer1.setLastName("Gamal");
		customerRespository.save(customer1);
		Customer customer2 = new Customer();
		customer2.setFirstName("Ali");
		customer2.setLastName("Ahmed");
		customerRespository.save(customer2);
		Customer customer3 = new Customer();
		customer3.setFirstName("Mahmoud");
		customer3.setLastName("Zaki");
		customerRespository.save(customer3);
		
		
		
	}
	
	

}
