package com.cg.cabapi.service;

import java.util.List;

import com.cg.cabapi.model.Customer;


public interface CustomerService {

	
	
	public Customer getCustomer(String customerId);
	public void updateCustomer(Customer Customer);
	Customer getCustomer(Customer Customer);
	public Customer addCustomer(Customer Customer);
	public List<Customer> getAll() ;
		
	
	
	
}
