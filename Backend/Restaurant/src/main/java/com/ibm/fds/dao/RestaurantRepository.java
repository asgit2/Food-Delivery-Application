package com.ibm.fds.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.fds.bean.Restaurants;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurants, Integer> {

	List<Restaurants> findByrestaurantName(String name);
	
//	@Query("SELECT R FROM restaurants R WHERE State =:state order by restaurantName")
//	List<Restaurants> FilterByLocation(@Param("state") String state);

	Iterable<Restaurants> findByState(String state);

	Iterable<Restaurants> findByCity(String city);

}