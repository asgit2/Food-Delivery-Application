package com.ibm.fda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.fda.bean.Cart;
import com.ibm.fda.dao.CartRepository;

@Service
public class CartService {

	@Autowired
	CartRepository repo;

	public Iterable<Cart> getAllCart() {
		return repo.findAll();
	}

	public void addToCart(Cart thecart) {
		repo.save(thecart);
	}

	public void removeFromCart(int id) {
		repo.deleteById(id);	
	}

	
}
