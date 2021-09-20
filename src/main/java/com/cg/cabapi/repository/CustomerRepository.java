package com.cg.cabapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.cabapi.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {

	Customer findByCustomerId(String customerId);
}