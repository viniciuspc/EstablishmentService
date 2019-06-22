package com.ubiwhere.EstablishmentService.web;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ubiwhere.EstablishmentService.model.EstablishmentAggregation;
import com.ubiwhere.EstablishmentService.model.EstablishmentReview;
import com.ubiwhere.EstablishmentService.model.FHRS.Establishment;
import com.ubiwhere.EstablishmentService.service.EstablishmentFHRSService;
import com.ubiwhere.EstablishmentService.service.EstablishmentReviewService;

import io.swagger.annotations.ApiOperation;

@RestController
public class EstablishmentServiceController {
	
	@Autowired
	private EstablishmentFHRSService establishmentFHRSService;
	
	@Autowired
	private EstablishmentReviewService establishmentReviewService;
	
	
	@GetMapping(value="estabilishment/{establishment_id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="Return agregation information for the given establishment", notes=" Will consult the Establishment Review microservice as well as the FHRS and agregate the both information in one sigle return.")
	public EstablishmentAggregation getEstablishmentAggregation(@PathVariable("establishment_id") long id) throws InterruptedException, ExecutionException {
		
		
		CompletableFuture<EstablishmentReview> establishmentReview = establishmentReviewService.getEstablishmentReview(id);
		
		CompletableFuture<Establishment> establishment = establishmentFHRSService.getEstablishment(id);
		
		//Wait for the both threads return their results
		CompletableFuture.allOf(establishmentReview,establishment).join();
		
		EstablishmentAggregation establishmentAggregation = new EstablishmentAggregation(establishment.get(), establishmentReview.get());
		
		
		return establishmentAggregation;
	}
	
}
