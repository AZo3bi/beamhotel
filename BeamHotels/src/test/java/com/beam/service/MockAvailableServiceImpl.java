package com.beam.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.beam.entity.AvailableHotelResponse;
import com.beam.entity.BestHotelResponse;
import com.beam.entity.CrazyHotelResponse;
import com.beam.provider.HotelProviders;


public class MockAvailableServiceImpl {

	public List<AvailableHotelResponse> getAllAvailableHotels(Date fromDate,
			Date toDate,
			String city,
			String numberOfAdults) {
		
		List<AvailableHotelResponse> availableHotelsResponses = new ArrayList<>();
		String [] amenities = {"hakona","matata"};	
		
		BestHotelResponse best = new BestHotelResponse("Belek", 4, 22, "hakona,matata");
		CrazyHotelResponse crazy = new CrazyHotelResponse("Kia Palazo", "****", 35, 0.5, amenities);
		
		AvailableHotelResponse firstAvailableHotelsResponse = new AvailableHotelResponse(HotelProviders.BestHotels, best.getHotel(), 
				best.getHotelFare(), amenities, best.getHotelRate());
		
		AvailableHotelResponse secondAvailableHotelsResponse = new AvailableHotelResponse(HotelProviders.CrazyHotels, crazy.getHotelName(), 
				crazy.getPrice(), crazy.getAmenities(), crazy.getRateValue(crazy.getRate()));
		
		availableHotelsResponses.add(firstAvailableHotelsResponse);
		availableHotelsResponses.add(secondAvailableHotelsResponse);
		
		return availableHotelsResponses;
	}
	
}
