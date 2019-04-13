package com.beam.provider;

import java.util.List;

import com.beam.entity.AvailableHotelResponse;

public interface ProviderService {
	public List<AvailableHotelResponse> getAvailableHotels();
}
