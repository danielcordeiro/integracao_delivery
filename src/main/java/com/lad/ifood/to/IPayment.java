package com.lad.ifood.to;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class IPayment implements Serializable {
	private static final long serialVersionUID = 1L;

	@SerializedName("name")
	private String name;

	@SerializedName("code")
	private String code;

	@SerializedName("value")
	private Float value;

	@SerializedName("prepaid")
	private Boolean prepaid;

	@SerializedName("externalCode")
	private String externalCode;

	@SerializedName("changeFor")
	private Float changeFor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	public Boolean getPrepaid() {
		return prepaid;
	}

	public void setPrepaid(Boolean prepaid) {
		this.prepaid = prepaid;
	}

	public String getExternalCode() {
		return externalCode;
	}

	public void setExternalCode(String externalCode) {
		this.externalCode = externalCode;
	}

	public Float getChangeFor() {
		return changeFor;
	}

	public void setChangeFor(Float changeFor) {
		this.changeFor = changeFor;
	}

}
