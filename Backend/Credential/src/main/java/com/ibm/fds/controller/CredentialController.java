package com.ibm.fds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fds.bean.Credential;
import com.ibm.fds.service.CredentialService;

@RestController
@RequestMapping("/credentials")
public class CredentialController {

	@Autowired
	CredentialService service;
	
	@RequestMapping("/all")
	public Iterable<Credential> getAllCredentialData() {
		return service.geAlltCredentialDetails();
	}
	@PostMapping( "/add")
	public void AddNewUser(@RequestBody Credential theCredentail ) {
		service.addnewUser(theCredentail);
	}
	@PutMapping("/update")
	public void UpdateUser(@RequestBody Credential theCredentail) {
		service.UpdateUser(theCredentail);
	}
	
}
