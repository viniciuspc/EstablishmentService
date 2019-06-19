package com.ubiwhere.model;

/**
 * Model representing an establishment review
 * @author vinicius
 *
 */

public class EstablishmentReview {
	private final long id;
	private final double averageReviewScore;
	private final int numberofReviews;
	
	public EstablishmentReview(long id, double averageReviewScore, int numberofReviews) {
		super();
		this.id = id;
		this.averageReviewScore = averageReviewScore;
		this.numberofReviews = numberofReviews;
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
	
	

}
