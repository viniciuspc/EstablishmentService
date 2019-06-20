package com.ubiwhere.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Model representing an establishment review
 * @author vinicius
 *
 */

@Entity
public class EstablishmentReviewEntity {
	private @Id @GeneratedValue long  id;
	private double averageReviewScore;
	private int numberofReviews;
	
	public EstablishmentReviewEntity() {}
	
	public EstablishmentReviewEntity(long id, double averageReviewScore, int numberofReviews) {
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
	
	
	

}
