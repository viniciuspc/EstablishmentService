package com.ubiwhere.service;


import com.ubiwhere.exception.ResourceNotFoundException;
import com.ubiwhere.model.EstablishmentReviewEntity;

/**
 * Service class interface for EstablishmentReview to make a bridge between controller and repository
 * @author vinicius
 *
 */
public interface EstablishmentReviewService {
	
	/**
	 * Lists all the establishment reviews at the database.
	 * @return intereable with the establishment reviews
	 */
	public Iterable<EstablishmentReviewEntity> getEstablishmentReviews();
	
	/**
	 * Save the establishment review at the database
	 * @param establishmentReview
	 */
	public void saveEstablishmentReview(EstablishmentReviewEntity establishmentReview);
	
	/**
	 * Get the establishment review with the id from the database
	 * @param id of establishment review to be retrieved
	 * @return establishment review with the id
	 * @throws ResourceNotFoundException if no establishment review for the id was found.
	 */
	public EstablishmentReviewEntity getEstablishmentReview(long id) throws ResourceNotFoundException;
	
	/**
	 * Delete the establishment review with the id from the database
	 * @param id of the establishment review to be deleted.
	 * @throws ResourceNotFoundException if id is null.
	 */
	public void deleteEstablishmentReviewEntity(long id) throws ResourceNotFoundException;
	
	/**
	 * Update the establishmentReview with the new data.
	 * @param establishmentReview with new data to be updated.
	 * @throws ResourceNotFoundException
	 */
	public EstablishmentReviewEntity updateEstablishmentReviewEntity(EstablishmentReviewEntity establishmentReview) throws ResourceNotFoundException;

}
