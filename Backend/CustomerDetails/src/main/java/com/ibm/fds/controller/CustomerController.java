package com.ibm.fds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fds.bean.Customer;
import com.ibm.fds.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@GetMapping("/all")
	public Iterable<Customer> getAllCustomerDetails() {
		return service.getAllCustomerDetails();
	}
	@PostMapping("/add")
	public void addNewCustomer(@RequestBody Customer theCustomer) {
		service.addNewCustomer(theCustomer);
	}
	@PutMapping("/update")
	public void UpdateCustomer(@RequestBody Customer theCustomer) {
		service.UpdateCustomer(theCustomer);
	}
}
