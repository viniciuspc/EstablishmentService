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
public class EstablishmentReviewServiceImpl implements EstablishmentReviewService {
	
	@Autowired
	EstablishmentReviewRepository establishmentReviweRepository;

	@Override
	public Iterable<EstablishmentReviewEntity> getEstablishmentReviews() {
		return this.establishmentReviweRepository.findAll();
	}

	@Override
	public void saveEstablishmentReview(EstablishmentReviewEntity establishmentReview) {
		this.establishmentReviweRepository.save(establishmentReview);
		
	}

	@Override
	public EstablishmentReviewEntity getEstablishmentReview(long id) throws ResourceNotFoundException {
		return this.establishmentReviweRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException(id)) ;
	}

	@Override
	public void deleteEstablishmentReviewEntity(long id) throws ResourceNotFoundException {
		this.establishmentReviweRepository.deleteById(id);
		
	}

	@Override
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
