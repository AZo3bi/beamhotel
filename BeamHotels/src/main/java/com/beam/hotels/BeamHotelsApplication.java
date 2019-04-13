package com.beam.hotels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.beam"})
public class BeamHotelsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeamHotelsApplication.class, args);
	}

}
