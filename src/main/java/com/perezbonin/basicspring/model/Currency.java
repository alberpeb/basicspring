package com.perezbonin.basicspring.model;

import java.math.BigDecimal;

public class Currency {
	BigDecimal purchasePrice;
	BigDecimal salesPrice;
	
	public Currency() {
	}
	public Currency(double purchasePrice, double salesPrice) {
		this.purchasePrice = BigDecimal.valueOf(purchasePrice);
		this.salesPrice = BigDecimal.valueOf(salesPrice);
	}
	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	public BigDecimal getSalesPrice() {
		return salesPrice;
	}
	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}
}
