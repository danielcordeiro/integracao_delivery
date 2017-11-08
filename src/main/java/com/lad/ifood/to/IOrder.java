package com.lad.ifood.to;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.lad.util.UtilLadIfood;

public class IOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@SerializedName("id")
	private String id;

	@SerializedName("reference")
	private String reference;

	@SerializedName("shortReference")
	private String shortReference;

	@SerializedName("createdAt")
	private String createdAt;

	private Date createdAtDate;

	@SerializedName("type")
	private String type;

	@SerializedName("merchant")
	private IMerchant merchant;

	@SerializedName("payments")
	private List<IPayment> payments;

	@SerializedName("customer")
	private ICustomer customer;

	@SerializedName("items")
	private List<IItem> items;

	@SerializedName("deliveryAddress")
	private IDeliveryAddress deliveryAddress;

	@SerializedName("subTotal")
	private Float subTotal;

	@SerializedName("totalPrice")
	private Float totalPrice;

	@SerializedName("deliveryFee")
	private Float deliveryFee;

	@SerializedName("deliveryDateTime")
	private String deliveryDateTime;

	private Date deliveryDateTimeDate;

	public IOrder() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getShortReference() {
		return shortReference;
	}

	public void setShortReference(String shortReference) {
		this.shortReference = shortReference;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public IMerchant getMerchant() {
		return merchant;
	}

	public void setMerchant(IMerchant merchant) {
		this.merchant = merchant;
	}

	public List<IPayment> getPayments() {
		return payments;
	}

	public void setPayments(List<IPayment> payments) {
		this.payments = payments;
	}

	public List<IItem> getItems() {
		return items;
	}

	public void setItems(List<IItem> items) {
		this.items = items;
	}

	public IDeliveryAddress getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(IDeliveryAddress deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Float subTotal) {
		this.subTotal = subTotal;
	}

	public Float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Float getDeliveryFee() {
		return deliveryFee;
	}

	public void setDeliveryFee(Float deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	public String getDeliveryDateTime() {
		return deliveryDateTime;
	}

	public void setDeliveryDateTime(String deliveryDateTime) {
		this.deliveryDateTime = deliveryDateTime;
	}

	public Date getCreatedAtDate() {
		if (getCreatedAt() != null) {
			createdAtDate = UtilLadIfood.formataDataAtualComT(getCreatedAt());
		}
		return createdAtDate;
	}

	public void setCreatedAtDate(Date createdAtDate) {
		this.createdAtDate = createdAtDate;
	}

	public Date getDeliveryDateTimeDate() {
		if (getDeliveryDateTime() != null) {
			deliveryDateTimeDate = UtilLadIfood.formataDataAtualComT(getDeliveryDateTime());
		}
		return deliveryDateTimeDate;
	}

	public void setDeliveryDateTimeDate(Date deliveryDateTimeDate) {
		this.deliveryDateTimeDate = deliveryDateTimeDate;
	}

	public ICustomer getCustomer() {
		return customer;
	}

	public void setCustomer(ICustomer customer) {
		this.customer = customer;
	}
}
