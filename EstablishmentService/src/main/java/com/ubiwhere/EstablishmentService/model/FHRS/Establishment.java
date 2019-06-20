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
    public int fHRSID;
    @JsonProperty("LocalAuthorityBusinessID")
    public String localAuthorityBusinessID;
    @JsonProperty("BusinessName")
    public String businessName;
    @JsonProperty("BusinessType")
    public String businessType;
    @JsonProperty("BusinessTypeID")
    public int businessTypeID;
    @JsonProperty("AddressLine1")
    public String addressLine1;
    @JsonProperty("AddressLine2")
    public String addressLine2;
    @JsonProperty("AddressLine3")
    public String addressLine3;
    @JsonProperty("AddressLine4")
    public String addressLine4;
    @JsonProperty("PostCode")
    public String postCode;
    @JsonProperty("Phone")
    public String phone;
    @JsonProperty("RatingValue")
    public String ratingValue;
    @JsonProperty("RatingKey")
    public String ratingKey;
    @JsonProperty("RatingDate")
    public Date ratingDate;
    @JsonProperty("LocalAuthorityCode")
    public String localAuthorityCode;
    @JsonProperty("LocalAuthorityName")
    public String localAuthorityName;
    @JsonProperty("LocalAuthorityWebSite")
    public String localAuthorityWebSite;
    @JsonProperty("LocalAuthorityEmailAddress")
    public String localAuthorityEmailAddress;
    public Scores scores;
    @JsonProperty("SchemeType")
    public String schemeType;
    public Geocode geocode;
    @JsonProperty("RightToReply")
    public String rightToReply;
    @JsonProperty("Distance")
    public Double distance;
    @JsonProperty("NewRatingPending")
    public boolean newRatingPending;
    public Meta meta;
    public List<Link> links;

}
