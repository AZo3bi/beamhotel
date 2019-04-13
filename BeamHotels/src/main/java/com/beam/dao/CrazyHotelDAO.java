package com.beam.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.beam.entity.CrazyHotelResponse;

@Repository
public class CrazyHotelDAO {

	private static Map<Integer, CrazyHotelResponse> crazyHotelsResponse;
	static String[] s1 = {"Hakona","Matata"};
	static {
		
		crazyHotelsResponse = new HashMap<Integer, CrazyHotelResponse>(){
			{
				put(1, new CrazyHotelResponse("Kia Belek", "*****", 40, 0.5, s1));
				put(2, new CrazyHotelResponse("Kia Palazo", "**", 20, 0.5, s1));
				put(3, new CrazyHotelResponse("Kia Memnto", "****", 15, 0.5, s1));
				put(4, new CrazyHotelResponse("Kia Monotoric", "*****", 50, 0.5, s1));
				put(5, new CrazyHotelResponse("Kia Molako", "****", 25, 0.5, s1));
			}
		};
	}
	
	public Collection<CrazyHotelResponse> getAllCrazyHotels(){
		return this.crazyHotelsResponse.values();
	}
}
