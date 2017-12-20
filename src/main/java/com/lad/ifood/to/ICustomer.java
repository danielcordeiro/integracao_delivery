package com.lad.ifood.to;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class ICustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@SerializedName("id")
	private String id;

	@SerializedName("name")
	private String name;

	@SerializedName("phone")
	private String phone;

	@SerializedName("email")
	private String email;

	@SerializedName("taxPayerIdentificationNumber")
	private String taxPayerIdentificationNumber;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTaxPayerIdentificationNumber() {
		return taxPayerIdentificationNumber;
	}

	public void setTaxPayerIdentificationNumber(String taxPayerIdentificationNumber) {
		this.taxPayerIdentificationNumber = taxPayerIdentificationNumber;
	}

}
