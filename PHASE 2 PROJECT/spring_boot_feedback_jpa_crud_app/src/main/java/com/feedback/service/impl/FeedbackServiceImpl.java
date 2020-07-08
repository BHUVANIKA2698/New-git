package com.feedback.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.dao.FeedbackDAO;
import com.feedback.model.Feedback;
import com.feedback.service.FeedbackService;


@Service

public class FeedbackServiceImpl implements FeedbackService {
	@Autowired
	private FeedbackDAO dao;

	@Override
	public Feedback createFeedback(Feedback feedback) {
		
		return dao.save(feedback);
	}

	@Override
	public Feedback updateFeedback(Feedback feedback) {
		
		return dao.save(feedback);
	}
	@Override
	public Feedback getFeedbackById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<Feedback> getAllFeedbacks() {
		
		return dao.findAll();
	}

	@Override
	public List<Feedback> getFeedbacksByRange(int range) {
		
		return dao.findByRange(range);
	}

	@Override
	public List<Feedback> getFeedbacksByComplaint(String complaint) {
		
		return dao.findByComplaint(complaint);
	}

	@Override
	public void deleteFeedbackById(int id) {
		dao.deleteById(id);

	}

	}
