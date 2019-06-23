package com.ubiwhere.EstablishmentService.model;

public class EstablishmentReview {
	private long  id;
	private double averageReviewScore;
	private int numberofReviews;
	
	public EstablishmentReview() {
	}

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

	public void setId(long id) {
		this.id = id;
	}

	public void setAverageReviewScore(double averageReviewScore) {
		this.averageReviewScore = averageReviewScore;
	}

	public void setNumberofReviews(int numberofReviews) {
		this.numberofReviews = numberofReviews;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(averageReviewScore);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + numberofReviews;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof EstablishmentReview))
			return false;
		EstablishmentReview other = (EstablishmentReview) obj;
		if (Double.doubleToLongBits(averageReviewScore) != Double.doubleToLongBits(other.averageReviewScore))
			return false;
		if (id != other.id)
			return false;
		if (numberofReviews != other.numberofReviews)
			return false;
		return true;
	}
	
	

}
