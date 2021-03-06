package com.mycompany.api.product_review;

public class ProductReviewResponse
{
	private Boolean success;
	private Integer reviewId;
	private String errorMessage;
	
	public ProductReviewResponse(Boolean success, Integer reviewId)
	{
		this.success = success;
		this.reviewId = reviewId;
	}
	public Boolean getSuccess()
	{
		return success;
	}
	public void setSuccess(Boolean success)
	{
		this.success = success;
	}
	public Integer getReviewId()
	{
		return reviewId;
	}
	public void setReviewId(Integer reviewId)
	{
		this.reviewId = reviewId;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
}
