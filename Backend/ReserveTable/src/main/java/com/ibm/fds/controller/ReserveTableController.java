package com.ibm.fds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fds.bean.ReserveTable;
import com.ibm.fds.service.ReserveTableService;

@RestController
@RequestMapping("/reservetable")
public class ReserveTableController {

	@Autowired
	ReserveTableService service;
	
	@GetMapping("/all")
	public Iterable<ReserveTable> getAllReservetable() {
		return service.getAllReservetable();
	}
	@PostMapping("/add")
	public void addReserveTable(@RequestBody ReserveTable booked) {
		service.bookATable(booked);
	}
}
