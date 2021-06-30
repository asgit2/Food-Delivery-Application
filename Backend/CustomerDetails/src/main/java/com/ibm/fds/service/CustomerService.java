package com.ibm.fds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.fds.bean.Customer;
import com.ibm.fds.dao.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository repo;

	public Iterable<Customer> getAllCustomerDetails() {
		return repo.findAll();
	}

	public void addNewCustomer(Customer theCustomer) {
		repo.save(theCustomer);
		
	}

	public void UpdateCustomer(Customer theCustomer) {
		repo.save(theCustomer);
		
	}
	
}
