package com.lad.ifood.to;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class ISubItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@SerializedName("name")
	private String name;

	@SerializedName("quantity")
	private Float quantity;

	@SerializedName("price")
	private Float price;

	@SerializedName("totalPrice")
	private Float totalPrice;

	@SerializedName("discount")
	private Float discount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getQuantity() {
		return quantity;
	}

	public void setQuantity(Float quantity) {
		this.quantity = quantity;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

}
