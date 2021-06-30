package com.ibm.fda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fda.bean.Cart;
import com.ibm.fda.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	CartService service;
	
	@GetMapping("/all")
	public Iterable<Cart> getAllCart() {
		return service.getAllCart();
	}
	@PostMapping("/add")
	public void addToCart(@RequestBody Cart thecart) {
		service.addToCart(thecart);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		service.removeFromCart(id);
	}
}
