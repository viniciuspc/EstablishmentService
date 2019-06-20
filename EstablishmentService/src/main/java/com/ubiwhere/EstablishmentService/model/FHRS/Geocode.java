package com.ubiwhere.EstablishmentService.model.FHRS;

/**
 * Model of Geocode from FHRS API
 * @author vinicius
 *
 */
public class Geocode {
	private String longitude;
    private String latitude;
    
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
    
    
    
}
