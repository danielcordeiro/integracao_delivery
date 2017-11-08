package com.lad.ifood.to;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class IDeliveryAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@SerializedName("formattedAddress")
	private String formattedAddress;

	@SerializedName("country")
	private String country;

	@SerializedName("state")
	private String state;

	@SerializedName("city")
	private String city;

	@SerializedName("coordinates")
	private ICoordinate coordinates;

	@SerializedName("neighborhood")
	private String neighborhood;

	@SerializedName("streetName")
	private String streetName;

	@SerializedName("streetNumber")
	private String streetNumber;

	@SerializedName("postalCode")
	private String postalCode;

	@SerializedName("reference")
	private String reference;

	@SerializedName("complement")
	private String complement;

	public String getFormattedAddress() {
		return formattedAddress;
	}

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public ICoordinate getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(ICoordinate coordinates) {
		this.coordinates = coordinates;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

}
