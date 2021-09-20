package com.cg.cabapi.web;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.cabapi.model.Customer;

import com.cg.cabapi.serviceimpl.CustomerServiceImpl;



@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl customerService;
	
	
	@GetMapping(value="/all")
	public List<Customer> getAllCustomer(){
		return customerService.getAll();
		
	}
	

	@GetMapping(value = "/{customerId}")
    public Customer getCustomer(@PathVariable String customerId){
        return customerService.getCustomer(customerId);
    }
	
	@PutMapping(value = "/{customerId}")
    public void updateCustomer(@RequestBody Customer Customer) {
		customerService.updateCustomer(Customer);
    }


	
	@PostMapping(value="/add",consumes = MediaType.APPLICATION_JSON_VALUE, 
	        produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer addCustomer (@RequestBody Customer customerDto ) {
		Customer c =customerService.addCustomer(customerDto);
		return c;
	}
}
	
	

	
//	@PutMapping("/updatecustomer")
//	public Customer modifyStudent(@RequestBody Customer s) {
//		
//		Customer stu =customerService.updateCustomer(s);
//		return stu;
//	}
//	
	
	
	
