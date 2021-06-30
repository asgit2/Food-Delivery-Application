package com.ibm.fds.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fds.bean.Menu;
import com.ibm.fds.service.MenuService;

@RestController
@RequestMapping("/menu")
public class MenuControllers {

	@Autowired
	MenuService service;
	
	@RequestMapping("/all")
	public Iterable<Menu> getAllMenu() {
		return service.getAllMenu();
	}
	
	@PostMapping("/add")
	public void addNewMenu(@RequestBody Menu theMenu) {
		service.addNewMenu(theMenu);
	}
	@PutMapping("/update")
	public void UpdateMenu(@RequestBody Menu theMenu) {
		service.UpdateMenu(theMenu);
	}
	@DeleteMapping("/delete/{menuId}")
	public void deleteAMenu(@PathVariable int menuId) {
		service.deleteMenu(menuId);
	}
	
	// Search by name 
	@GetMapping("/name/{name}")
	public Iterable<Menu> getByName(@PathVariable String name) {
		return service.getByName(name);
	}
	
	@GetMapping("/category/{category}")
	public Iterable<Menu> getByCategory(@PathVariable String category) {
		return service.getByCategory(category);
	}
	
	@GetMapping("/restaurant/{id}")
	public Iterable<Menu> getByRestaurant(@PathVariable int id) {
		return service.getByRestaurant(id);
	}
	@GetMapping("/menu/{menuId}")
	public void DeleteAMenu(@PathVariable int menuId) {
		service.deleteMenu(menuId);
	}
	
}
