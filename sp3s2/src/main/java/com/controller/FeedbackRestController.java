package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dao.FeedbackDao;
import com.model.Feedback;

@RestController
public class FeedbackRestController {
	
	@Autowired
	private FeedbackDao feedbackDao;
	
	@PostMapping(path = "/feedback")
	public Feedback feedbackSubmit(@RequestParam String responderName, @RequestParam String feedbackString)
	{
		Feedback feedback = new Feedback(responderName, feedbackString);
		feedbackDao.save(feedback);
		return feedback;
	}

}
