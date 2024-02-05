package javaproject.flightApi.business.abstracts;

import java.util.List;

import javaproject.flightApi.entities.concretes.Airport;

public interface AirportService {
	List<Airport> getAll();

}
