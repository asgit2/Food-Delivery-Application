package com.ibm.fds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.fds.bean.ReserveTable;
import com.ibm.fds.dao.ReserveTableRepository;

@Service
public class ReserveTableService {

	@Autowired
	ReserveTableRepository repo;

	public Iterable<ReserveTable> getAllReservetable() {
		return repo.findAll();
	}

	public void bookATable(ReserveTable booked) {
		repo.save(booked);
	}
	
}
