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

	@SerializedName("externalCode")
	private String externalCode;

	private Long idPdv;

	private boolean configuracaoEncontrada;

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

	public Long getIdPdv() {
		return idPdv;
	}

	public void setIdPdv(Long idPdv) {
		this.idPdv = idPdv;
	}

	public String getExternalCode() {
		return externalCode;
	}

	public void setExternalCode(String externalCode) {
		this.externalCode = externalCode;
	}

	public boolean isConfiguracaoEncontrada() {
		return configuracaoEncontrada;
	}

	public void setConfiguracaoEncontrada(boolean configuracaoEncontrada) {
		this.configuracaoEncontrada = configuracaoEncontrada;
	}

}
