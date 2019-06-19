package com.ubiwhere.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ubiwhere.model.EstablishmentReview;

@RestController
public class EstablishmentReviewController {
	
	/**
	 * Retrive an estabilishment review from the database.
	 * @param id of estabilishment to retrive the review
	 * @return An estabilishment review for this estabilishment id.
	 */
	@RequestMapping(value = "/review", method=RequestMethod.GET)
	public EstablishmentReview review(@RequestParam(value="establishment_id") long id) {
		return new EstablishmentReview(id, 19.9, 260);
	}

}
