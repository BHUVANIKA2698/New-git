package com.feedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.model.Feedback;
import com.feedback.service.FeedbackService;

@RestController
public class FeedbackController {
	@Autowired
	private FeedbackService service;
	
	@PostMapping("/feedback")
	public Feedback createFeedback(@RequestBody Feedback feedback) {

		return service.createFeedback(feedback);
	}

	@PutMapping("/feedback")
	public Feedback updateFeedback(@RequestBody Feedback feedback) {

		return service.updateFeedback(feedback);
	}

	@GetMapping("/feedback/(id)")
	public Feedback getFeedbackbyid(@PathVariable int id) {
		return service.getFeedbackById(id);
	}
	
	@GetMapping("/feedbacks")
	public List<Feedback> getAllFeedbacks() {

		return service.getAllFeedbacks();
	}

	@GetMapping("/feedbacks/range/{range}")
	public List<Feedback> getFeedbacksByRange(@PathVariable("range") int range) {

		return service.getFeedbacksByRange(range);
	}

	@GetMapping("/feedbacks/complaint/{complaint}")
	public List<Feedback> getFeedbacksByComplaint(@PathVariable("complaint") String complaint) {

		return service.getFeedbacksByComplaint(complaint);
	}

	@DeleteMapping("/feedback/{id}")
	public void deleteFeedbackById(@PathVariable("id") int id) {
		service.deleteFeedbackById(id);

	}
	
	
	
	
}
