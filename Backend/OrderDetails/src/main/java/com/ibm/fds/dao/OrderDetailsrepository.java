package com.ibm.fds.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.fds.bean.OrderDetails;
@Repository
public interface OrderDetailsrepository extends CrudRepository<OrderDetails, Integer> {

}
