package com.ubiwhere.EstablishmentService.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ubiwhere.EstablishmentService.model.EstablishmentReview;

/**
 * Service to send request to the EstablishmentReview webservice to obtain the review.
 * @author vinicius
 *
 */
@Service
public class EstablishmentReviewService {
	
	private RestTemplate restTemplateEureka;
	
	@Autowired
	public EstablishmentReviewService(@Qualifier("withEureka") RestTemplate restTemplateEureka) {
		this.restTemplateEureka = restTemplateEureka;
	}
	
	/**
	 * Make a request to the EstablishmentReview webservice using the id.
	 * This will be an asynchronous call to archive the performance requirement.
	 * @param id of the Establishment to get the review from.
	 * @return the review for the Establishment.
	 */
	@Async
	public CompletableFuture<EstablishmentReview> getEstablishmentReview(long id) {
		
		EstablishmentReview establishmentReview = restTemplateEureka.getForObject("http://establishment-review-service/review/"+id, EstablishmentReview.class);
		
		return CompletableFuture.completedFuture(establishmentReview);
	}

}
