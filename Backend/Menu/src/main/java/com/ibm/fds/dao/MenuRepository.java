package com.ibm.fds.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.fds.bean.Menu;

@Repository
public interface MenuRepository extends CrudRepository<Menu, Integer> {

	List<Menu> findByName(String name);
	
	//@Query("SELECT M.Name,M.Description, M.price FROM Menu M where Category =?1")
	Iterable<Menu> findByCategory(String category);

	Iterable<Menu> findByRestId(int id);

}
