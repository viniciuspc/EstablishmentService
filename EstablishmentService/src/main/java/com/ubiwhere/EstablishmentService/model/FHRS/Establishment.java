package com.ubiwhere.EstablishmentService.model.FHRS;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model of Establishment from FHRS API
 * @author vinicius
 *
 */
public class Establishment {
	@JsonProperty("FHRSID")
    private int fHRSID;
    @JsonProperty("LocalAuthorityBusinessID")
    private String localAuthorityBusinessID;
    @JsonProperty("BusinessName")
    private String businessName;
    @JsonProperty("BusinessType")
    private String businessType;
    @JsonProperty("BusinessTypeID")
    private int businessTypeID;
    @JsonProperty("AddressLine1")
    private String addressLine1;
    @JsonProperty("AddressLine2")
    private String addressLine2;
    @JsonProperty("AddressLine3")
    private String addressLine3;
    @JsonProperty("AddressLine4")
    private String addressLine4;
    @JsonProperty("PostCode")
    private String postCode;
    @JsonProperty("Phone")
    private String phone;
    @JsonProperty("RatingValue")
    private String ratingValue;
    @JsonProperty("RatingKey")
    private String ratingKey;
    @JsonProperty("RatingDate")
    private Date ratingDate;
    @JsonProperty("LocalAuthorityCode")
    private String localAuthorityCode;
    @JsonProperty("LocalAuthorityName")
    private String localAuthorityName;
    @JsonProperty("LocalAuthorityWebSite")
    private String localAuthorityWebSite;
    @JsonProperty("LocalAuthorityEmailAddress")
    private String localAuthorityEmailAddress;
    @JsonProperty("scores")
    private Scores scores;
    @JsonProperty("SchemeType")
    private String schemeType;
    @JsonProperty("geocode")
    private Geocode geocode;
    @JsonProperty("RightToReply")
    private String rightToReply;
    @JsonProperty("Distance")
    private Double distance;
    @JsonProperty("NewRatingPending")
    private boolean newRatingPending;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("links")
    private List<Link> links;
	
    public int getfHRSID() {
		return fHRSID;
	}
	public void setfHRSID(int fHRSID) {
		this.fHRSID = fHRSID;
	}
	public String getLocalAuthorityBusinessID() {
		return localAuthorityBusinessID;
	}
	public void setLocalAuthorityBusinessID(String localAuthorityBusinessID) {
		this.localAuthorityBusinessID = localAuthorityBusinessID;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public int getBusinessTypeID() {
		return businessTypeID;
	}
	public void setBusinessTypeID(int businessTypeID) {
		this.businessTypeID = businessTypeID;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressLine3() {
		return addressLine3;
	}
	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}
	public String getAddressLine4() {
		return addressLine4;
	}
	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRatingValue() {
		return ratingValue;
	}
	public void setRatingValue(String ratingValue) {
		this.ratingValue = ratingValue;
	}
	public String getRatingKey() {
		return ratingKey;
	}
	public void setRatingKey(String ratingKey) {
		this.ratingKey = ratingKey;
	}
	public Date getRatingDate() {
		return ratingDate;
	}
	public void setRatingDate(Date ratingDate) {
		this.ratingDate = ratingDate;
	}
	public String getLocalAuthorityCode() {
		return localAuthorityCode;
	}
	public void setLocalAuthorityCode(String localAuthorityCode) {
		this.localAuthorityCode = localAuthorityCode;
	}
	public String getLocalAuthorityName() {
		return localAuthorityName;
	}
	public void setLocalAuthorityName(String localAuthorityName) {
		this.localAuthorityName = localAuthorityName;
	}
	public String getLocalAuthorityWebSite() {
		return localAuthorityWebSite;
	}
	public void setLocalAuthorityWebSite(String localAuthorityWebSite) {
		this.localAuthorityWebSite = localAuthorityWebSite;
	}
	public String getLocalAuthorityEmailAddress() {
		return localAuthorityEmailAddress;
	}
	public void setLocalAuthorityEmailAddress(String localAuthorityEmailAddress) {
		this.localAuthorityEmailAddress = localAuthorityEmailAddress;
	}
	public Scores getScores() {
		return scores;
	}
	public void setScores(Scores scores) {
		this.scores = scores;
	}
	public String getSchemeType() {
		return schemeType;
	}
	public void setSchemeType(String schemeType) {
		this.schemeType = schemeType;
	}
	public Geocode getGeocode() {
		return geocode;
	}
	public void setGeocode(Geocode geocode) {
		this.geocode = geocode;
	}
	public String getRightToReply() {
		return rightToReply;
	}
	public void setRightToReply(String rightToReply) {
		this.rightToReply = rightToReply;
	}
	public Double getDistance() {
		return distance;
	}
	public void setDistance(Double distance) {
		this.distance = distance;
	}
	public boolean isNewRatingPending() {
		return newRatingPending;
	}
	public void setNewRatingPending(boolean newRatingPending) {
		this.newRatingPending = newRatingPending;
	}
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
    
    

}
