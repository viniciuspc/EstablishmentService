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
    
    
}
