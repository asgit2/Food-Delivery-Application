package com.ibm.fds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.fds.bean.Feedback;
import com.ibm.fds.dao.FeedbackRepository;

@Service
public class FeedbackService {

	@Autowired
	FeedbackRepository repo;

	public Iterable<Feedback> getAllFeedbacks() {
		return repo.findAll();
	}

	public void addFeedback(Feedback theFeedback) {
		repo.save(theFeedback);
		
	}
	
}
