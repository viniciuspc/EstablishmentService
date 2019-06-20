package com.ubiwhere.EstablishmentService.model.FHRS;

/**
 * Model of Link from FHRS API
 * @author vinicius
 *
 */
public class Link {
	private String rel;
	private String href;
	
	public String getRel() {
		return rel;
	}
	public void setRel(String rel) {
		this.rel = rel;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	
	
}
