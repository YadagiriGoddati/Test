/**
 * 
 */
package com.example.ExampleTest.Request;

/**
 * @author Lenovo
 *
 */
public class RequestRating {

	private String userName;
	
	private Integer ratingNumber;

	private String dummyLabel;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getRatingNumber() {
		return ratingNumber;
	}

	public void setRatingNumber(Integer ratingNumber) {
		this.ratingNumber = ratingNumber;
	}
	
	

	public String getDummyLabel() {
		return dummyLabel;
	}

	public void setDummyLabel(String dummyLabel) {
		this.dummyLabel = dummyLabel;
	}

	@Override
	public String toString() {
		return "RequestRating [userName=" + userName + ", ratingNumber=" + ratingNumber + ", dummyLabel=" + dummyLabel
				+ "]";
	}

	

	
	
	
	
	
	
}
