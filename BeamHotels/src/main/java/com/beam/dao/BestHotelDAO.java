package com.beam.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.beam.entity.BestHotelResponse;
import com.beam.entity.CrazyHotelResponse;

@Repository
public class BestHotelDAO {

	private static Map<Integer, BestHotelResponse> bestHotelsResponse;
	
	static {
		
		bestHotelsResponse = new HashMap<Integer, BestHotelResponse>(){
			{
				put(1, new BestHotelResponse("Belek", 4, 0.3, "Hakona,Matata"));
				put(2, new BestHotelResponse("Palazo", 3, 0.1, "Hakona,Matata"));
				put(3, new BestHotelResponse("Mortino", 5, 0.2, "Hakona,Matata"));
				put(4, new BestHotelResponse("Momento", 6, 0.5, "Hakona,Matata"));
				put(5, new BestHotelResponse("Montero", 3, 0.6, "Hakona,Matata"));
			}
		};
	}
	
	public Collection<BestHotelResponse> getAllBestHotels(){
		return this.bestHotelsResponse.values();
	}
}
