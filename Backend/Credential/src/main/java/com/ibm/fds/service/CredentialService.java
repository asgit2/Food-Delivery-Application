package com.ibm.fds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.fds.bean.Credential;
import com.ibm.fds.dao.CredentialRepository;

@Service
public class CredentialService {

	@Autowired
	CredentialRepository repo;
	
	public Iterable<Credential> geAlltCredentialDetails() {
		return repo.findAll();
	}

	public void addnewUser(Credential theCredentail) {
		repo.save(theCredentail);
		
	}

	public void UpdateUser(Credential theCredentail) {
		repo.save(theCredentail);
		
	}
}
