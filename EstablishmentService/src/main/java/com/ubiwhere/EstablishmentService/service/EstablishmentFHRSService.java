package com.ubiwhere.EstablishmentService.service;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ubiwhere.EstablishmentService.model.FHRS.Establishment;

/**
 * Service to send request to the Food Hygiene Rating Scheme API to obtain Establishment informations.
 * @author vinicius
 *
 */
@Service
public class EstablishmentFHRSService {
	
	private RestTemplate restTemplateWithoutEureka;
	
	@Autowired
	public EstablishmentFHRSService(@Qualifier("withoutEureka")  RestTemplate restTemplateWithoutEureka) {
		this.restTemplateWithoutEureka = restTemplateWithoutEureka;
	}
	
	/**
	 * Make a request to the Food Hygiene Rating Scheme API webservice using the id.
	 * This will be an asynchronous call to archive the performance requirement.
	 * @param id of the Establishment to get the review from.
	 * @return the review for the Establishment.
	 */
	@Async
	public CompletableFuture<Establishment> getEstablishment(long id) {
		//Seting up the request body
		HttpHeaders headers = new HttpHeaders();
		headers.setContentLength(1461);
		headers.set("x-api-version", "2");
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		//Request body is created with request body and headers
		HttpEntity<Establishment> requestEntity = new HttpEntity<Establishment>(new Establishment(), headers);
		
		ResponseEntity<Establishment> establishment = restTemplateWithoutEureka.exchange(
				"http://api.ratings.food.gov.uk/Establishments/"+id, 
				HttpMethod.GET, 
				requestEntity, 
				Establishment.class);
		
		return CompletableFuture.completedFuture(establishment.getBody());
		
	}

}
