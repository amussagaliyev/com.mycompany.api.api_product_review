package com.mycompany.api.product_review;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserReview
{
	@JsonProperty("productid")
	@NotNull(message="Product was not specified")
	@Min(value=1)
	private Integer productId;

	@JsonProperty("name")
	@NotBlank(message="Review name cannot be null")
	private String reviewerName;

	@JsonProperty("email")
	@NotBlank(message="Email cannot be empty")
	@Email(message="Incorrrect email address provided")
	private String reviewerEmailAddress;

	@JsonProperty("review")
	@NotBlank(message="Comment cannot be empty")
	@Size(max=3850, message="Max allowed length of comment is 3850")
	private String reviewText;
	
	@JsonProperty("rating")
	@NotNull(message="Rating was not specified")
	@Max(value=5)
	@Min(value=0)
	private Integer rating;

	public Integer getProductId()
	{
		return productId;
	}
	public void setProductId(Integer productId)
	{
		this.productId = productId;
	}
	public String getReviewerName()
	{
		return reviewerName;
	}
	public void setReviewerName(String reviewerName)
	{
		this.reviewerName = reviewerName;
	}
	public String getReviewerEmailAddress()
	{
		return reviewerEmailAddress;
	}
	public void setReviewerEmailAddress(String reviewerEmailAddress)
	{
		this.reviewerEmailAddress = reviewerEmailAddress;
	}
	public String getReviewText()
	{
		return reviewText;
	}
	public void setReviewText(String reviewText)
	{
		this.reviewText = reviewText;
	}
	public Integer getRating()
	{
		return rating;
	}
	public void setRating(Integer rating)
	{
		this.rating = rating;
	}
	
}
