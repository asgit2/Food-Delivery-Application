package com.ibm.fds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fds.bean.OrderDetails;
import com.ibm.fds.service.OrderDetailsService;

@RestController
@RequestMapping("/orders")
public class OrderDetailsController {
	
	@Autowired
	OrderDetailsService service;
	
	@GetMapping("/all")
	public Iterable<OrderDetails> getAllOrders() {
		return service.getAllOrders();
	}
	@PostMapping("/add")
	public void addOrderDetails(@RequestBody OrderDetails theOrder) {
		service.addOrderDetails(theOrder);
	}
}
