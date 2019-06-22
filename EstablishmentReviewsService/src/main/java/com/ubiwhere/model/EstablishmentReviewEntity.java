package com.ubiwhere.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Model representing an establishment review
 * @author vinicius
 *
 */

@Entity
@Table(name="establishment_review")
public class EstablishmentReviewEntity {
	private @Id long  id;
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
