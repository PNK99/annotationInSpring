package com.model;

import javax.validation.constraints.Min;

public class DiscountBean {
	@Min(value = 1, message = "{label.invalid1}")
	private double productPrice;
	private String productType;

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public double calculateFinal(DiscountBean db) {
		double discountedPrice=0.0; 
		if((db.getProductType()).equals("Toys"))
		discountedPrice = db.getProductPrice() - (db.getProductPrice() *( 50.0/100));
		else if((db.getProductType()).equals("Apparels"))
			discountedPrice = db.getProductPrice() - (db.getProductPrice()*(10.0/100));
		else if((db.getProductType()).equals("Electronics"))
			discountedPrice = db.getProductPrice() - (db.getProductPrice()*( 25.0/100));
		return discountedPrice;
	}
}
