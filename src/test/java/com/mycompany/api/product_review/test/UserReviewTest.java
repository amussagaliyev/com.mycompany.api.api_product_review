package com.mycompany.api.product_review.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.api.product_review.UserReview;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

@TestInstance(Lifecycle.PER_CLASS)
public class UserReviewTest
{
	
	private UserReview userReview;
	private Integer productId = 1;
	private Integer rating = 2;
	private String reviewerEmailAddress = "reviewerEmailAddress";
	private String reviewerName = "reviewerName";
	private String reviewText = "reviewText";
	
	@BeforeAll
	public void init()
	{
		userReview = new UserReview();
	}
	
	@Test
	public void when_setProductId_Then_Getter_ReturnsSameValue()
	{
		userReview.setProductId(productId);
		assertEquals(productId, userReview.getProductId());
	}
	

	@Test
	public void when_setRating_Then_Getter_ReturnsSameValue()
	{
		userReview.setRating(rating);
		assertEquals(rating, userReview.getRating());
	}
	
	@Test
	public void when_setReviewerEmailAddress_Then_Getter_ReturnsSameValue()
	{
		userReview.setReviewerEmailAddress(reviewerEmailAddress);
		assertEquals(reviewerEmailAddress, userReview.getReviewerEmailAddress());
	}
	
	@Test
	public void when_setReviewerName_Then_Getter_ReturnsSameValue()
	{
		userReview.setReviewerName(reviewerName);
		assertEquals(reviewerName, userReview.getReviewerName());
	}
	
	@Test
	public void when_setReviewText_Then_Getter_ReturnsSameValue()
	{
		userReview.setReviewText(reviewText);
		assertEquals(reviewText, userReview.getReviewText());
	}
	
	@Test
	public void userReviewJsonSerializationTest() throws JsonParseException, JsonMappingException, IOException
	{
		String sourceJson = "{" + 
				"\"name\":\"Elvis Presley\"," + 
				"\"email\":\"theking@elvismansion.com\"," + 
				"\"productid\":\"4\"," + 
				"\"review\":\"I really love the product and will recommend!\"," + 
				"\"rating\":\"4\"" + 
				"}";
		
		ObjectMapper objectMapper = new ObjectMapper();
		UserReview userReview = objectMapper.readValue(sourceJson, UserReview.class);
		
		assertTrue(userReview.getProductId().equals(4));
		assertTrue(userReview.getRating().equals(4));
		assertTrue(userReview.getReviewerEmailAddress().equals("theking@elvismansion.com"));
		assertTrue(userReview.getReviewerName().equals("Elvis Presley"));
		assertTrue(userReview.getReviewText().equals("I really love the product and will recommend!"));
		
		objectMapper = new ObjectMapper();
		String destJson = objectMapper.writeValueAsString(userReview);
		
		assertTrue(destJson != null && !destJson.isEmpty());
		
	}
	
}
