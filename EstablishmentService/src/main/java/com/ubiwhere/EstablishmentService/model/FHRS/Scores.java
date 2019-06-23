package com.ubiwhere.EstablishmentService.model.FHRS;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model of Scores from FHRS API
 * @author vinicius
 *
 */
public class Scores {
	@JsonProperty("Hygiene")
    private Integer hygiene;
    @JsonProperty("Structural")
    private Integer structural;
    @JsonProperty("ConfidenceInManagement")
    private Integer confidenceInManagement;
    
	public Integer getHygiene() {
		return hygiene;
	}
	public void setHygiene(Integer hygiene) {
		this.hygiene = hygiene;
	}
	public Integer getStructural() {
		return structural;
	}
	public void setStructural(Integer structural) {
		this.structural = structural;
	}
	public Integer getConfidenceInManagement() {
		return confidenceInManagement;
	}
	public void setConfidenceInManagement(Integer confidenceInManagement) {
		this.confidenceInManagement = confidenceInManagement;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((confidenceInManagement == null) ? 0 : confidenceInManagement.hashCode());
		result = prime * result + ((hygiene == null) ? 0 : hygiene.hashCode());
		result = prime * result + ((structural == null) ? 0 : structural.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Scores))
			return false;
		Scores other = (Scores) obj;
		if (confidenceInManagement == null) {
			if (other.confidenceInManagement != null)
				return false;
		} else if (!confidenceInManagement.equals(other.confidenceInManagement))
			return false;
		if (hygiene == null) {
			if (other.hygiene != null)
				return false;
		} else if (!hygiene.equals(other.hygiene))
			return false;
		if (structural == null) {
			if (other.structural != null)
				return false;
		} else if (!structural.equals(other.structural))
			return false;
		return true;
	}
    
    
}
