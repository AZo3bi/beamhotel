package com.beam.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beam.dao.BestHotelDAO;
import com.beam.entity.AvailableHotelResponse;
import com.beam.entity.BestHotelResponse;
import com.beam.entity.CrazyHotelResponse;
import com.beam.provider.HotelProviders;
import com.beam.provider.ProviderService;

@Service
public class BestHotelService implements ProviderService {
	
	@Autowired
	private BestHotelDAO bestHotelDAO;
	
	public Collection<BestHotelResponse> getAllBestHotels(){
		return this.bestHotelDAO.getAllBestHotels();
	}

	@Override
	public List<AvailableHotelResponse> getAvailableHotels() {
		
		List<AvailableHotelResponse> availableHotelRespnoses = new ArrayList<AvailableHotelResponse>();
		List<BestHotelResponse> bestHotelsResponse =  new ArrayList<BestHotelResponse>(this.getAllBestHotels());
		
		for(BestHotelResponse best:bestHotelsResponse) {
			String[] amenities = best.getRoomAmenities().split(",");
			AvailableHotelResponse availableHotelRespnose = new AvailableHotelResponse(HotelProviders.BestHotels, best.getHotel(), 
					best.getHotelFare(), amenities, best.getHotelRate());
			availableHotelRespnoses.add(availableHotelRespnose);
		}
		
		return availableHotelRespnoses;
	}
}
