package com.ubiwhere.EstablishmentService.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ubiwhere.EstablishmentService.model.EstablishmentAggregation;

@RestController
public class EstablishmentServiceController {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("estabilishment/{establishment_id}")
	public EstablishmentAggregation getEstablishmentAggregation(@PathVariable("establishment_id") long id) {
		/*EstablishmentAggregation estabilishmentAggregation = new EstablishmentAggregation();
		estabilishmentAggregation.setId(id);*/
		
		EstablishmentAggregation estabilishmentAggregation = restTemplate.getForObject("http://esatblishment-review-service/review/"+id, EstablishmentAggregation.class);
		
		return estabilishmentAggregation;
	}
	
}
