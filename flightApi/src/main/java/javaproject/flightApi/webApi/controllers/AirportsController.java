package javaproject.flightApi.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javaproject.flightApi.business.abstracts.AirportService;
import javaproject.flightApi.entities.concretes.Airport;

@RestController
@RequestMapping("/api/airports")
public class AirportsController {
	private AirportService airportService;
	
	@Autowired //for dependency injection
	public AirportsController(AirportService airportService) {
		super();
		this.airportService = airportService;
	}
	
	@GetMapping("/getAll")
	public List<Airport> getAll()
	{
		return airportService.getAll();
	}
}
