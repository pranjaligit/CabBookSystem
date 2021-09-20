package com.cg.cabapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class Customer {
  @UniqueElements
	@Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	    private long customerId;
  @NotEmpty(message = "first name must not be empty")
	    private String name;
  
  @NotEmpty(message = "contact number must not be empty")
	    private String contactNo;
	    
  @NotEmpty(message = "email should be a valid email")
        private String emailAddress;

	    public long getCustomerId() {
	        return customerId;
	    }

	    public void setCustomerId(long customerId) {
	        this.customerId = customerId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getContactNo() {
	        return contactNo;
	    }

	    public void setContactNo(String contactNo) {
	        this.contactNo = contactNo;
	    }

	    public String getEmailAddress() {
	        return emailAddress;
	    }

	    public void setEmailAddress(String emailAddress) {
	        this.emailAddress = emailAddress;
	    }

	}

