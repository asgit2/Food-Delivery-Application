package com.ibm.fds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.fds.bean.Feedback;
import com.ibm.fds.service.FeedbackService;

@RestController
@RequestMapping("feedback")
public class FeedbackController {
	@Autowired
	FeedbackService service;
	
	@GetMapping("/all")
	public Iterable<Feedback> getAllFeedbacks() {
		return service.getAllFeedbacks();
	}
	
	@PostMapping("/add")
	public void addFeedback(@RequestBody Feedback theFeedback) {
		service.addFeedback(theFeedback);
	}
	

}
