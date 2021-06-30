package com.ibm.fds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.fds.bean.OrderDetails;
import com.ibm.fds.dao.OrderDetailsrepository;

@Service
public class OrderDetailsService {

	@Autowired
	OrderDetailsrepository repo;

	public Iterable<OrderDetails> getAllOrders() {
		return repo.findAll();
	}

	public void addOrderDetails(OrderDetails theOrder) {
		repo.save(theOrder);
	}
	
}
