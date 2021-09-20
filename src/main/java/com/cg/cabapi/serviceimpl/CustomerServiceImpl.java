package com.cg.cabapi.serviceimpl;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cabapi.model.Customer;

import com.cg.cabapi.repository.CustomerRepository;
import com.cg.cabapi.service.CustomerService;


@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	public Customer getCustomer(String customerId) {
		return customerRepository.findByCustomerId(customerId);
	}

	public void updateCustomer(Customer Customer) {
		Customer customer = getCustomer(Customer);
		customerRepository.save(customer);
	}

	public Customer getCustomer(Customer Customer) {
		Customer customer = new Customer();
		customer.setContactNo(Customer.getContactNo());
		customer.setCustomerId(Customer.getCustomerId());
		customer.setEmailAddress(Customer.getEmailAddress());
		customer.setName(Customer.getName());
		
		return customer;
	}

	

	
	public Customer addCustomer(Customer Customer) {
		//Customer customer = addCustomer(customerDto);
		return customerRepository.save(Customer);
		//return customer;
		}

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return (List<Customer>) customerRepository.findAll();
	}
}

	