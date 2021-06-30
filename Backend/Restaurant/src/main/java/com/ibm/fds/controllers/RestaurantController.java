package com.ibm.fds.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fds.bean.Restaurants;
import com.ibm.fds.services.RestaurantServices;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

	@Autowired
	RestaurantServices service;
	
	@GetMapping("/all")
	public Iterable<Restaurants> getAllRestaurants() {
		return service.getAllRestaurants();
	}
	// for Admin management to Update & Delete
	@PostMapping("/add")
	public void addNewRestaurant(@RequestBody Restaurants restaurant) {
		service.addNewRestaurant(restaurant);
	}
	@PutMapping("/update")
	public void UpdateRestaurant(@RequestBody Restaurants restaurant) {
		service.UpdateRestaurant(restaurant);
	}
	
	@GetMapping("/state/{state}")
	Iterable<Restaurants> FilterByLocation(@PathVariable String state){
		return service.SortByLocation(state);
	}
	@GetMapping("/city/{city}")
	Iterable<Restaurants> FilterByCity(@PathVariable String city) {
		return service.sortByCity(city);
	}
}
