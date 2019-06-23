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
    private long fHRSID;
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
	
    public long getfHRSID() {
		return fHRSID;
	}
	public void setfHRSID(long fHRSID) {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressLine1 == null) ? 0 : addressLine1.hashCode());
		result = prime * result + ((addressLine2 == null) ? 0 : addressLine2.hashCode());
		result = prime * result + ((addressLine3 == null) ? 0 : addressLine3.hashCode());
		result = prime * result + ((addressLine4 == null) ? 0 : addressLine4.hashCode());
		result = prime * result + ((businessName == null) ? 0 : businessName.hashCode());
		result = prime * result + ((businessType == null) ? 0 : businessType.hashCode());
		result = prime * result + businessTypeID;
		result = prime * result + ((distance == null) ? 0 : distance.hashCode());
		result = prime * result + (int) (fHRSID ^ (fHRSID >>> 32));
		result = prime * result + ((geocode == null) ? 0 : geocode.hashCode());
		result = prime * result + ((links == null) ? 0 : links.hashCode());
		result = prime * result + ((localAuthorityBusinessID == null) ? 0 : localAuthorityBusinessID.hashCode());
		result = prime * result + ((localAuthorityCode == null) ? 0 : localAuthorityCode.hashCode());
		result = prime * result + ((localAuthorityEmailAddress == null) ? 0 : localAuthorityEmailAddress.hashCode());
		result = prime * result + ((localAuthorityName == null) ? 0 : localAuthorityName.hashCode());
		result = prime * result + ((localAuthorityWebSite == null) ? 0 : localAuthorityWebSite.hashCode());
		result = prime * result + ((meta == null) ? 0 : meta.hashCode());
		result = prime * result + (newRatingPending ? 1231 : 1237);
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((postCode == null) ? 0 : postCode.hashCode());
		result = prime * result + ((ratingDate == null) ? 0 : ratingDate.hashCode());
		result = prime * result + ((ratingKey == null) ? 0 : ratingKey.hashCode());
		result = prime * result + ((ratingValue == null) ? 0 : ratingValue.hashCode());
		result = prime * result + ((rightToReply == null) ? 0 : rightToReply.hashCode());
		result = prime * result + ((schemeType == null) ? 0 : schemeType.hashCode());
		result = prime * result + ((scores == null) ? 0 : scores.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Establishment))
			return false;
		Establishment other = (Establishment) obj;
		if (addressLine1 == null) {
			if (other.addressLine1 != null)
				return false;
		} else if (!addressLine1.equals(other.addressLine1))
			return false;
		if (addressLine2 == null) {
			if (other.addressLine2 != null)
				return false;
		} else if (!addressLine2.equals(other.addressLine2))
			return false;
		if (addressLine3 == null) {
			if (other.addressLine3 != null)
				return false;
		} else if (!addressLine3.equals(other.addressLine3))
			return false;
		if (addressLine4 == null) {
			if (other.addressLine4 != null)
				return false;
		} else if (!addressLine4.equals(other.addressLine4))
			return false;
		if (businessName == null) {
			if (other.businessName != null)
				return false;
		} else if (!businessName.equals(other.businessName))
			return false;
		if (businessType == null) {
			if (other.businessType != null)
				return false;
		} else if (!businessType.equals(other.businessType))
			return false;
		if (businessTypeID != other.businessTypeID)
			return false;
		if (distance == null) {
			if (other.distance != null)
				return false;
		} else if (!distance.equals(other.distance))
			return false;
		if (fHRSID != other.fHRSID)
			return false;
		if (geocode == null) {
			if (other.geocode != null)
				return false;
		} else if (!geocode.equals(other.geocode))
			return false;
		if (links == null) {
			if (other.links != null)
				return false;
		} else if (!links.equals(other.links))
			return false;
		if (localAuthorityBusinessID == null) {
			if (other.localAuthorityBusinessID != null)
				return false;
		} else if (!localAuthorityBusinessID.equals(other.localAuthorityBusinessID))
			return false;
		if (localAuthorityCode == null) {
			if (other.localAuthorityCode != null)
				return false;
		} else if (!localAuthorityCode.equals(other.localAuthorityCode))
			return false;
		if (localAuthorityEmailAddress == null) {
			if (other.localAuthorityEmailAddress != null)
				return false;
		} else if (!localAuthorityEmailAddress.equals(other.localAuthorityEmailAddress))
			return false;
		if (localAuthorityName == null) {
			if (other.localAuthorityName != null)
				return false;
		} else if (!localAuthorityName.equals(other.localAuthorityName))
			return false;
		if (localAuthorityWebSite == null) {
			if (other.localAuthorityWebSite != null)
				return false;
		} else if (!localAuthorityWebSite.equals(other.localAuthorityWebSite))
			return false;
		if (meta == null) {
			if (other.meta != null)
				return false;
		} else if (!meta.equals(other.meta))
			return false;
		if (newRatingPending != other.newRatingPending)
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (postCode == null) {
			if (other.postCode != null)
				return false;
		} else if (!postCode.equals(other.postCode))
			return false;
		if (ratingDate == null) {
			if (other.ratingDate != null)
				return false;
		} else if (!ratingDate.equals(other.ratingDate))
			return false;
		if (ratingKey == null) {
			if (other.ratingKey != null)
				return false;
		} else if (!ratingKey.equals(other.ratingKey))
			return false;
		if (ratingValue == null) {
			if (other.ratingValue != null)
				return false;
		} else if (!ratingValue.equals(other.ratingValue))
			return false;
		if (rightToReply == null) {
			if (other.rightToReply != null)
				return false;
		} else if (!rightToReply.equals(other.rightToReply))
			return false;
		if (schemeType == null) {
			if (other.schemeType != null)
				return false;
		} else if (!schemeType.equals(other.schemeType))
			return false;
		if (scores == null) {
			if (other.scores != null)
				return false;
		} else if (!scores.equals(other.scores))
			return false;
		return true;
	}
	
	
    
    

}
