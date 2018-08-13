package com.mycompany.api.product_review.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.mycompany.api.product_review.ProductReviewResponse;

@TestInstance(Lifecycle.PER_CLASS)
public class ProductReviewResponseTest
{
	private Boolean success = true;
	private Integer reviewID = -1;
	
	private ProductReviewResponse productReviewResponse;
	
	@BeforeAll
	public void init()
	{
		productReviewResponse = new ProductReviewResponse(true, -1);
	}
	
	@Test
	public void getSuccess_ReturnsSameValue()
	{
		assertEquals(productReviewResponse.getSuccess(), success);
	}
	
	@Test
	public void getReviewID_ReturnsSameValue()
	{
		assertEquals(productReviewResponse.getReviewId(), reviewID);
	}
	
}
