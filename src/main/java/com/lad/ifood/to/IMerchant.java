package com.lad.ifood.to;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class IMerchant implements Serializable {
	private static final long serialVersionUID = 1L;

	@SerializedName("id")
	private String id;

	@SerializedName("name")
	private String name;

	@SerializedName("phones")
	private String[] phones;

	@SerializedName("address")
	private IAddress address;

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

	public String[] getPhones() {
		return phones;
	}

	public void setPhones(String[] phones) {
		this.phones = phones;
	}

	public IAddress getAddress() {
		return address;
	}

	public void setAddress(IAddress address) {
		this.address = address;
	}

}
