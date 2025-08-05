package com.examly.springapp.service;

import com.examly.springapp.model.Feedback;
import com.examly.springapp.model.FeedbackStatus;

import java.util.List;

public interface FeedbackService {
    Feedback submitFeedback(Feedback feedback);
    List<Feedback> getUserFeedback(String userId);
    List<Feedback> getAllFeedback();
    Feedback updateFeedbackStatus(Long id, FeedbackStatus status);
    void deleteFeedback(Long id);
}
