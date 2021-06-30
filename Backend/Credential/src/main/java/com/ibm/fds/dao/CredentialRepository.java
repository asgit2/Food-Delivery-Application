package com.ibm.fds.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.fds.bean.Credential;

@Repository
public interface CredentialRepository extends CrudRepository<Credential, Integer> {

}
