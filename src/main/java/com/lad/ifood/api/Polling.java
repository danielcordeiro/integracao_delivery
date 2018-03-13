package com.lad.ifood.api;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class Polling implements Serializable {
	private static final long serialVersionUID = 1L;

	@SerializedName("id")
	private String id;

	@SerializedName("code")
	private String code;

	@SerializedName("correlationId")
	private String correlationId;

	@SerializedName("createdAt")
	private String createdAt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

}
