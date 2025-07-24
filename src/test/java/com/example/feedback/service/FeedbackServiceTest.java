package com.example.feedback.service;

import com.example.feedback.model.Feedback;
import com.example.feedback.repository.FeedbackRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FeedbackServiceTest {

	private FeedbackRepository feedbackRepository;
	private FeedbackService feedbackService;

	@BeforeEach
	void setUp() {
		feedbackRepository = mock(FeedbackRepository.class);
		feedbackService = new FeedbackService(feedbackRepository);
	}

	@Test
	void testSaveFeedback() {
		Feedback feedback = new Feedback();
		feedback.setName("Akshat");
		feedback.setEmail("akshat@example.com");
		feedback.setMessage("Very useful API");

		when(feedbackRepository.save(feedback)).thenReturn(feedback);

		Feedback savedFeedback = feedbackService.saveFeedback(feedback);

		assertNotNull(savedFeedback);
		assertEquals("Akshat", savedFeedback.getName());
		assertEquals("akshat@example.com", savedFeedback.getEmail());
		verify(feedbackRepository, times(1)).save(feedback);
	}

	@Test
	void testGetAllFeedback() {
		Feedback f1 = new Feedback();
		f1.setName("Akshat");
		f1.setEmail("akshat@example.com");
		f1.setMessage("Message 1");

		Feedback f2 = new Feedback();
		f2.setName("Richa");
		f2.setEmail("richa@example.com");
		f2.setMessage("Message 2");

		List<Feedback> mockList = Arrays.asList(f1, f2);

		when(feedbackRepository.findAll()).thenReturn(mockList);

		List<Feedback> result = feedbackService.getAllFeedback();

		assertEquals(2, result.size());
		assertEquals("Richa", result.get(1).getName());
		verify(feedbackRepository, times(1)).findAll();
	}
}

