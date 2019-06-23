package com.ubiwhere.model;

import org.junit.Assert;
import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

/**
 * Unit test for the EstablishmentReviewEntity
 * @author vinicius
 *
 */
public class EstablishmentReviewEntityTest {
	
	/**
	 * Verify if the equals contract is correct
	 */
	@Test
	public void equalsContractTest() {
		EqualsVerifier.forClass(EstablishmentReviewEntity.class).suppress(Warning.NONFINAL_FIELDS).verify();
	}
	
	@Test
	public void testConstructor() {
		long id = 1L;
		double averageReviewScore = 10.5;
		int numberofReviews = 100;
		
		EstablishmentReviewEntity establishmentReviewEntity = new EstablishmentReviewEntity(id,averageReviewScore,numberofReviews);
		Assert.assertEquals(id, establishmentReviewEntity.getId());
		Assert.assertEquals(averageReviewScore, establishmentReviewEntity.getAverageReviewScore(), 0);
		Assert.assertEquals(numberofReviews, establishmentReviewEntity.getNumberofReviews());
	}
	
	@Test
	public void testGettersAndSetters() {
		
		long id = 1L;
		double averageReviewScore = 10.5;
		int numberofReviews = 100;
		
		EstablishmentReviewEntity establishmentReviewEntity = new EstablishmentReviewEntity();
		establishmentReviewEntity.setId(id);
		establishmentReviewEntity.setAverageReviewScore(averageReviewScore);
		establishmentReviewEntity.setNumberofReviews(numberofReviews);
		
		Assert.assertEquals(id, establishmentReviewEntity.getId());
		Assert.assertEquals(averageReviewScore, establishmentReviewEntity.getAverageReviewScore(), 0);
		Assert.assertEquals(numberofReviews, establishmentReviewEntity.getNumberofReviews());
		
		
	}

}
