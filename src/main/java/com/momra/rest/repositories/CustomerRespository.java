package com.momra.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.momra.rest.model.entities.Customer;

@Repository
public interface CustomerRespository extends JpaRepository<Customer, Long> {

}
