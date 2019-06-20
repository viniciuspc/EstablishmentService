package com.ubiwhere.EstablishmentService.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	public EstablishmentAggregation getEstablishmentAggregation(@PathVariable("establishment_id") long id) {
		/*EstablishmentAggregation estabilishmentAggregation = new EstablishmentAggregation();
		estabilishmentAggregation.setId(id);*/
		
		EstablishmentAggregation estabilishmentAggregation = restTemplateEureka.getForObject("http://esatblishment-review-service/review/"+id, EstablishmentAggregation.class);
		
		//Establishment establishment = restTemplateWithoutEureka.getForObject("http://api.ratings.food.gov.uk/Establishments/"+id, Establishment.class);
		
		return estabilishmentAggregation;
	}
	
}
