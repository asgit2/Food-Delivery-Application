package com.ibm.fda.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.fda.bean.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {

}
