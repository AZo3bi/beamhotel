package com.beam.entity;

public class CrazyHotelResponse {

	String hotelName;
	String rate;
	double price;
	double discount;
	String[] amenities;
	
	public CrazyHotelResponse() {
		super();
	}
	
	public CrazyHotelResponse(String hotelName, String rate, double price, double discount, String[] amenities) {
		super();
		this.hotelName = hotelName;
		this.rate = rate;
		this.price = price;
		this.discount = discount;
		this.amenities = amenities;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String[] getAmenities() {
		return amenities;
	}
	public void setAmenities(String[] amenities) {
		this.amenities = amenities;
	}
	
	public Integer getRateValue(String rate) {
		return rate.length();
	}
	
	
}
