package com.ibm.fds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.fds.bean.Menu;
import com.ibm.fds.dao.MenuRepository;

@Service
public class MenuService {

	@Autowired
	MenuRepository repo;

	public Iterable<Menu> getAllMenu() {
		return repo.findAll();
	}
	public void addNewMenu(Menu theMenu) {
		repo.save(theMenu);
	}

	public void UpdateMenu(Menu theMenu) {
		repo.save(theMenu);
	}
	
	public List<Menu> getByName(String name) {
		return repo.findByName(name);
	}
	
	public Iterable<Menu> getByCategory(String category){
		return repo.findByCategory(category);
	}

	public void deleteMenu(int menuId) {
		 repo.deleteById(menuId);
	}
	public Iterable<Menu> getByRestaurant(int id) {
		return repo.findByRestId(id);
	}

	
}
