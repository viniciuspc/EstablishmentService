package com.ubiwhere.EstablishmentService.model;

public class EstablishmentAggregation {
	private long  id;
	private double averageReviewScore;
	private int numberofReviews;
	
	public EstablishmentAggregation() {
	}

	public long getId() {
		return id;
	}

	public double getAverageReviewScore() {
		return averageReviewScore;
	}

	public int getNumberofReviews() {
		return numberofReviews;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setAverageReviewScore(double averageReviewScore) {
		this.averageReviewScore = averageReviewScore;
	}

	public void setNumberofReviews(int numberofReviews) {
		this.numberofReviews = numberofReviews;
	}

}
