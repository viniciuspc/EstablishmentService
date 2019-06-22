package com.ubiwhere.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ubiwhere.exception.ResourceNotFoundException;
import com.ubiwhere.model.EstablishmentReviewEntity;
import com.ubiwhere.repository.EstablishmentReviewRepository;

/**
 * Service class implementation for EstablishmentReview to make a bridge between controller and repository
 * @author vinicius
 *
 */
@Service
public class EstablishmentReviewService {
	
	@Autowired
	EstablishmentReviewRepository establishmentReviweRepository;
	
	/**
	 * Lists all the establishment reviews at the database.
	 * @return intereable with the establishment reviews
	 */
	public Iterable<EstablishmentReviewEntity> getEstablishmentReviews() {
		return this.establishmentReviweRepository.findAll();
	}

	/**
	 * Save the establishment review at the database
	 * @param establishmentReview
	 */
	public void saveEstablishmentReview(EstablishmentReviewEntity establishmentReview) {
		this.establishmentReviweRepository.save(establishmentReview);
		
	}

	/**
	 * Get the establishment review with the id from the database
	 * @param id of establishment review to be retrieved
	 * @return establishment review with the id
	 * @throws ResourceNotFoundException if no establishment review for the id was found.
	 */
	public EstablishmentReviewEntity getEstablishmentReview(long id) throws ResourceNotFoundException {
		return this.establishmentReviweRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(id)) ;
	}

	/**
	 * Delete the establishment review with the id from the database
	 * @param id of the establishment review to be deleted.
	 * @throws ResourceNotFoundException if id is null.
	 */
	public void deleteEstablishmentReviewEntity(long id) throws ResourceNotFoundException {
		this.establishmentReviweRepository.deleteById(id);
		
	}

	/**
	 * Update the establishmentReview with the new data.
	 * @param establishmentReview with new data to be updated.
	 * @throws ResourceNotFoundException
	 */
	public EstablishmentReviewEntity updateEstablishmentReviewEntity(EstablishmentReviewEntity establishmentReview)
			throws ResourceNotFoundException {
		Optional<EstablishmentReviewEntity> establishmentReviewOptional = this.establishmentReviweRepository.findById(establishmentReview.getId());
		
		if(!establishmentReviewOptional.isPresent()) {
			throw new ResourceNotFoundException(establishmentReview.getId());
		}
		
		this.establishmentReviweRepository.save(establishmentReview);
		
		return establishmentReview;
		
	}

}
