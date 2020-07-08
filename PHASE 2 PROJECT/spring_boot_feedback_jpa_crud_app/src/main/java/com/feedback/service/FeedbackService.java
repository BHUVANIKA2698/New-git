package com.feedback.service;

import java.util.List;

import com.feedback.model.Feedback;
public interface FeedbackService {
	public Feedback createFeedback(Feedback feedback);
	public Feedback updateFeedback(Feedback feedback);
	public Feedback getFeedbackById(int id);
	public List<Feedback> getAllFeedbacks();
	public List<Feedback> getFeedbacksByRange(int range);
	public List<Feedback> getFeedbacksByComplaint(String complaint);
	public void deleteFeedbackById(int id);
	
	
	
	
}
