package com.ubiwhere.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ubiwhere.exception.ResourceNotFoundException;
import com.ubiwhere.model.EstablishmentReviewEntity;
import com.ubiwhere.service.EstablishmentReviewService;

@RestController
public class EstablishmentReviewController {
	
	@Autowired
	EstablishmentReviewService esablishmentReviewService;
	
	@GetMapping("/review")
	public Iterable<EstablishmentReviewEntity> retriveAllEstablishmentReview(){
		return this.esablishmentReviewService.getEstablishmentReviews();
	}
	
	/**
	 * Save a establishment review at the database
	 * @param establishmentReviewEntity
	 * @return
	 */
	@PostMapping(value="/review",
					produces = MediaType.APPLICATION_JSON_VALUE,
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<EstablishmentReviewEntity> saveEstablishmentReview(@RequestBody EstablishmentReviewEntity establishmentReviewEntity){
		this.esablishmentReviewService.saveEstablishmentReview(establishmentReviewEntity);
		return new ResponseEntity<EstablishmentReviewEntity>(establishmentReviewEntity, HttpStatus.CREATED);
	}
	
	/**
	 * Retrive an estabilishment review from the database.
	 * @param id of estabilishment review to be retrived
	 * @return An estabilishment review for this estabilishment id.
	 * @throws ResourceNotFoundException 
	 */
	@GetMapping(value = "/review/{establishment_id}",  
					produces=MediaType.APPLICATION_JSON_VALUE)
	public EstablishmentReviewEntity getEstablishmentreview(@PathVariable("establishment_id") long id) throws ResourceNotFoundException  {
		return this.esablishmentReviewService.getEstablishmentReview(id);
	}
	
	/**
	 * Delete an estabilishment review from the database.
	 * @param id of estabilishment to be delete
	 * @return An estabilishment review for this estabilishment id.
	 * @throws ResourceNotFoundException 
	 */
	@DeleteMapping(value = "/review/{establishment_id}")
	public void deleteEstablishmentreview(@PathVariable("establishment_id") long id) throws ResourceNotFoundException  {
		this.esablishmentReviewService.deleteEstablishmentReviewEntity(id);
		
	}
	
	@PutMapping(value="review/{id}",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	
	public @ResponseBody ResponseEntity<EstablishmentReviewEntity> updateEstablishmentReview(@RequestBody EstablishmentReviewEntity establishmentReviewEntity, @PathVariable long id){
		establishmentReviewEntity.setId(id);
		
			try {
				return new ResponseEntity<EstablishmentReviewEntity>(this.esablishmentReviewService.updateEstablishmentReviewEntity(establishmentReviewEntity), HttpStatus.OK);
			} catch (ResourceNotFoundException e) {
				return ResponseEntity.notFound().build();
			}
			
		
	}

}
