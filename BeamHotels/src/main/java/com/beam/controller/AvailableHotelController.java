package com.beam.controller;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.beam.entity.AvailableHotelResponse;
import com.beam.entity.BestHotelResponse;
import com.beam.service.AvailableHotelService;

@RestController
@RequestMapping("/hotels")
public class AvailableHotelController {
	
	@Autowired
	private AvailableHotelService availableHotelService;
	

	
	@GetMapping("/all-available")
	public List<AvailableHotelResponse> getAllAvailableHotels(
			@RequestParam(name = "fromDate", required = false) Date fromDate,
			@RequestParam(name = "toDate", required = false) Date toDate,
			@RequestParam(name = "city", required = false) String city,
			@RequestParam(name = "numberOfAdults", required = false) String numberOfAdults){
		return this.availableHotelService.getAllAvailableHotels(fromDate,
				toDate,
				city,
				numberOfAdults);
	}
	
	
}
