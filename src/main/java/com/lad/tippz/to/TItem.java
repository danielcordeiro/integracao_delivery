package com.lad.tippz.to;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.lad.ifood.to.ISubItem;

public class TItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@SerializedName("id")
	private String id;

	@SerializedName("name")
	private String name;

	@SerializedName("$_dateCreated")
	private String dateCreated;

	// @SerializedName("quantity")
	// private Float quantity;

	@SerializedName("price")
	private Float price;
	
	@SerializedName("chosenOptions")
	private List<TOption> chosenOptions;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}
