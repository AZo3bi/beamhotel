package com.beam.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beam.dao.CrazyHotelDAO;
import com.beam.entity.AvailableHotelResponse;
import com.beam.entity.CrazyHotelResponse;
import com.beam.provider.HotelProviders;
import com.beam.provider.ProviderService;

@Service
public class CrazyHotelService implements ProviderService {
	
	@Autowired
	private CrazyHotelDAO crazyHotelDAO;
	
	public Collection<CrazyHotelResponse> getAllCrazyHotels(){
		return this.crazyHotelDAO.getAllCrazyHotels();
	}

	@Override
	public List<AvailableHotelResponse> getAvailableHotels() {
		List<AvailableHotelResponse> availableHotelRespnoses = new ArrayList<AvailableHotelResponse>();
		
		List<CrazyHotelResponse> crazyHotelResponse =  new ArrayList<CrazyHotelResponse>(this.getAllCrazyHotels());
		
		for(CrazyHotelResponse crazy:crazyHotelResponse) {
			AvailableHotelResponse availableHotelRespnose = new AvailableHotelResponse(HotelProviders.CrazyHotels, crazy.getHotelName(), 
					crazy.getPrice(), crazy.getAmenities(), crazy.getRateValue(crazy.getRate()));
			availableHotelRespnoses.add(availableHotelRespnose);
		}
		
		return availableHotelRespnoses;
	}

}
