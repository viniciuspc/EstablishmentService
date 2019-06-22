package com.ubiwhere.EstablishmentService.model;

import com.ubiwhere.EstablishmentService.model.FHRS.Establishment;

/**
 * Class with the aggregation of the review and from the FHRS API
 * @author vinicius
 *
 */
public class EstablishmentAggregation {
	
	private Establishment establishment;
	private EstablishmentReview establishmentReview;
	
	public EstablishmentAggregation(Establishment establishment, EstablishmentReview establishmentReview) {
		super();
		this.establishment = establishment;
		this.establishmentReview = establishmentReview;
	}

	public Establishment getEstablishment() {
		return establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}

	public EstablishmentReview getEstablishmentReview() {
		return establishmentReview;
	}

	public void setEstablishmentReview(EstablishmentReview establishmentReview) {
		this.establishmentReview = establishmentReview;
	}
	
	

}
