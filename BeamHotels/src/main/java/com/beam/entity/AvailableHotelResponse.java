package com.beam.entity;

import com.beam.provider.HotelProviders;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class AvailableHotelResponse implements Comparable<AvailableHotelResponse> {

	HotelProviders provider;
	String hotelname;
	double fare;
	String[] amenities;
	
	@JsonIgnore
	Integer rate;
	
	public AvailableHotelResponse() {
	}
	
	public AvailableHotelResponse(HotelProviders provider, String hotelname, double fare, String[] amenities, Integer rate) {
		super();
		this.provider = provider;
		this.hotelname = hotelname;
		this.fare = fare;
		this.amenities = amenities;
		this.rate = rate;
	}
	
	
	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public HotelProviders getProvider() {
		return provider;
	}
	public void setProvider(HotelProviders provider) {
		this.provider = provider;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String[] getAmenities() {
		return amenities;
	}
	public void setAmenities(String[] amenities) {
		this.amenities = amenities;
	}

	@Override
	public int compareTo(AvailableHotelResponse arg) {
		return Integer.compare(arg.rate,this.rate);
	}
	
	
}
