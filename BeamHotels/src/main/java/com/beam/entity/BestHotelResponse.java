package com.beam.entity;

import java.util.ArrayList;
import java.util.List;

import com.beam.provider.HotelProviders;

public class BestHotelResponse {
	
	String hotel;
	int hotelRate;
	double hotelFare;
	String roomAmenities;
	
	public BestHotelResponse() {
		super();
	}
	
	public BestHotelResponse(String hotel, int hotelRate, double hotelFare, String roomAmenities) {
		super();
		this.hotel = hotel;
		this.hotelRate = hotelRate;
		this.hotelFare = hotelFare;
		this.roomAmenities = roomAmenities;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public int getHotelRate() {
		return hotelRate;
	}
	public void setHotelRate(int hotelRate) {
		this.hotelRate = hotelRate;
	}
	public double getHotelFare() {
		return hotelFare;
	}
	public void setHotelFare(double hotelFare) {
		this.hotelFare = hotelFare;
	}
	public String getRoomAmenities() {
		return roomAmenities;
	}
	public void setRoomAmenities(String roomAmenities) {
		this.roomAmenities = roomAmenities;
	}
	
	

}
