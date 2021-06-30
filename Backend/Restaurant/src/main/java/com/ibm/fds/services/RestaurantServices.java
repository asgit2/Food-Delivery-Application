package com.ibm.fds.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.fds.bean.Restaurants;
import com.ibm.fds.dao.RestaurantRepository;

@Service
public class RestaurantServices {

	@Autowired
	RestaurantRepository repo;

	public Iterable<Restaurants> getAllRestaurants() {
		return repo.findAll();
	}

	public void addNewRestaurant(Restaurants restaurant) {
		repo.save(restaurant);
	}

	public void UpdateRestaurant(Restaurants restaurant) {
		repo.save(restaurant);	
	}

	public List<Restaurants> getRestaurantByName(String name) {
		return repo.findByrestaurantName(name);
	}

	public Iterable<Restaurants> SortByLocation(String state){
		return repo.findByState(state);
	}

	public Iterable<Restaurants> sortByCity(String city) {
		return repo.findByCity(city);
	}
}
