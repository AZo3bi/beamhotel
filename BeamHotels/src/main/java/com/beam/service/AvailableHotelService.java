package com.beam.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.beam.entity.AvailableHotelResponse;
import com.beam.provider.ProviderService;

@Service
public class AvailableHotelService {

	@Autowired
	private BestHotelService bestHotelService;
	
	@Autowired
	private CrazyHotelService crazyHotelService;
	
	public List<AvailableHotelResponse> getAllAvailableHotels(Date fromDate,
			Date toDate,
			String city,
			String numberOfAdults){
		List<AvailableHotelResponse> availableHotelRespnose = new ArrayList<AvailableHotelResponse>();
		
		availableHotelRespnose.addAll(this.getAvailable(this.bestHotelService));
		availableHotelRespnose.addAll(this.getAvailable(this.crazyHotelService));
		
		Collections.sort(availableHotelRespnose);
		
		return availableHotelRespnose;
		
	}
	
	public List<AvailableHotelResponse> getAvailable(ProviderService providerService){
		return providerService.getAvailableHotels();
	}
}
