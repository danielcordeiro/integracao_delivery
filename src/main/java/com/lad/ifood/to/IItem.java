package com.lad.ifood.to;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class IItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@SerializedName("name")
	private String name;

	@SerializedName("quantity")
	private Float quantity;

	@SerializedName("price")
	private Float price;

	@SerializedName("subItemsPrice")
	private Float subItemsPrice;

	@SerializedName("totalPrice")
	private Float totalPrice;

	@SerializedName("discount")
	private Float discount;

	@SerializedName("externalCode")
	private String externalCode;

	@SerializedName("subItems")
	private List<ISubItem> subItems;
	
	private Long idProduto;

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

	public Float getSubItemsPrice() {
		return subItemsPrice;
	}

	public void setSubItemsPrice(Float subItemsPrice) {
		this.subItemsPrice = subItemsPrice;
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

	public String getExternalCode() {
		return externalCode;
	}

	public void setExternalCode(String externalCode) {
		this.externalCode = externalCode;
	}

	public List<ISubItem> getSubItems() {
		return subItems;
	}

	public void setSubItems(List<ISubItem> subItems) {
		this.subItems = subItems;
	}

	public Long getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(Long idProduto) {
		this.idProduto = idProduto;
	}

}
