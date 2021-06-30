package com.ibm.fds.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.fds.bean.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
