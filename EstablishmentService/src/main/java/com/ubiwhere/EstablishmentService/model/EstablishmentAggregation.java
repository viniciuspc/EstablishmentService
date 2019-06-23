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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((establishment == null) ? 0 : establishment.hashCode());
		result = prime * result + ((establishmentReview == null) ? 0 : establishmentReview.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof EstablishmentAggregation))
			return false;
		EstablishmentAggregation other = (EstablishmentAggregation) obj;
		if (establishment == null) {
			if (other.establishment != null)
				return false;
		} else if (!establishment.equals(other.establishment))
			return false;
		if (establishmentReview == null) {
			if (other.establishmentReview != null)
				return false;
		} else if (!establishmentReview.equals(other.establishmentReview))
			return false;
		return true;
	}

}
