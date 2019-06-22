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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ubiwhere.exception.ResourceNotFoundException;
import com.ubiwhere.model.EstablishmentReviewEntity;
import com.ubiwhere.service.EstablishmentReviewService;

import io.swagger.annotations.ApiOperation;

@RestController
public class EstablishmentReviewController {
	
	@Autowired
	EstablishmentReviewService esablishmentReviewService;
	
	/**
	 * List all the establishment from the database.
	 * @return List with all EstablishmentReviewEntity from the database
	 */
	@GetMapping("/review")
	@ApiOperation(value="List all the establishment reviews from the database.", notes=" Will display all the establishment reviews saved at the database.")
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
	@ApiOperation(value="Save a establishment review at the database.", notes=" Will save the informations from the json passed at the request body.")
	public @ResponseBody ResponseEntity<EstablishmentReviewEntity> saveEstablishmentReview(@RequestBody EstablishmentReviewEntity establishmentReviewEntity){
		this.esablishmentReviewService.saveEstablishmentReview(establishmentReviewEntity);
		return new ResponseEntity<EstablishmentReviewEntity>(establishmentReviewEntity, HttpStatus.CREATED);
	}
	
	/**
	 * Retrieve an establishment review from the database.
	 * @param id of establishment review to be retrieved
	 * @return An establishment review for this establishment id.
	 * @throws ResourceNotFoundException 
	 */
	@GetMapping(value = "/review/{establishment_id}",  
					produces=MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="Retrieve an establishment review from the database.", notes=" Will retrieve the review with the given id.")
	public ResponseEntity<EstablishmentReviewEntity> getEstablishmentreview(@PathVariable("establishment_id") long id) throws ResourceNotFoundException  {
		try {
			return new ResponseEntity<EstablishmentReviewEntity>(this.esablishmentReviewService.getEstablishmentReview(id), HttpStatus.OK);
		} catch (ResourceNotFoundException ex) {
			return ResponseEntity.notFound().build();
		}
	}
	
	/**
	 * Delete an establishment review from the database.
	 * @param id of establishment to be delete
	 * @return An establishment review for this establishment id.
	 * @throws ResourceNotFoundException 
	 */
	@DeleteMapping(value = "/review/{establishment_id}")
	@ApiOperation(value="Delete an establishment review from the database.", notes=" Will delete the review with the given id.")
	public void deleteEstablishmentreview(@PathVariable("establishment_id") long id) throws ResourceNotFoundException  {
		this.esablishmentReviewService.deleteEstablishmentReviewEntity(id);
		
	}
	
	/**
	 * Update an establishment review from the database with the json information.
	 * @param establishmentReviewEntity informations to be updated
	 * @param id of the establishment review to be updated
	 * @return the establishment review updated or an empty response if the id was not founded.
	 */
	@PutMapping(value="review/{establishment_id}",
			produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="Update an establishment review from the database.", notes=" Will update the review with the given id with the informations from json on the body request.")
	public @ResponseBody ResponseEntity<EstablishmentReviewEntity> updateEstablishmentReview(@RequestBody EstablishmentReviewEntity establishmentReviewEntity, @PathVariable("establishment_id") long id){
		establishmentReviewEntity.setId(id);
		
			try {
				return new ResponseEntity<EstablishmentReviewEntity>(this.esablishmentReviewService.updateEstablishmentReviewEntity(establishmentReviewEntity), HttpStatus.OK);
			} catch (ResourceNotFoundException e) {
				return ResponseEntity.notFound().build();
			}
			
		
	}

}
