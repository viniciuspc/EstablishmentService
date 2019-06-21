package com.ubiwhere.EstablishmentService.web;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ubiwhere.EstablishmentService.model.EstablishmentAggregation;
import com.ubiwhere.EstablishmentService.model.FHRS.Establishment;

@RestController
public class EstablishmentServiceController {
	
	private RestTemplate restTemplateEureka;
	private RestTemplate restTemplateWithoutEureka;
	
	@Autowired
	public EstablishmentServiceController(@Qualifier("withEureka") RestTemplate restTemplateEureka, @Qualifier("withoutEureka")  RestTemplate restTemplateWithoutEureka) {
		this.restTemplateEureka = restTemplateEureka;
		this.restTemplateWithoutEureka = restTemplateWithoutEureka;
	}
	
	@GetMapping("estabilishment/{establishment_id}")
	public Establishment getEstablishmentAggregation(@PathVariable("establishment_id") long id) {
		/*EstablishmentAggregation estabilishmentAggregation = new EstablishmentAggregation();
		estabilishmentAggregation.setId(id);*/
		
		//EstablishmentAggregation estabilishmentAggregation = restTemplateEureka.getForObject("http://establishment-review-service/review/"+id, EstablishmentAggregation.class);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentLength(1461);
		headers.set("x-api-version", "2");
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		
		
		Establishment establishment = restTemplateWithoutEureka.getForObject("http://api.ratings.food.gov.uk/Establishments/"+id, Establishment.class);
		
		return establishment;
	}
	
}
