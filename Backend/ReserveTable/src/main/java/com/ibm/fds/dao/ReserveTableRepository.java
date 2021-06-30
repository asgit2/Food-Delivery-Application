package com.ibm.fds.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.fds.bean.ReserveTable;

@Repository
public interface ReserveTableRepository extends CrudRepository<ReserveTable, Integer> {

}
