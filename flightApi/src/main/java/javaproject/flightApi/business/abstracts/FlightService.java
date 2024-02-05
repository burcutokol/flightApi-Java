package javaproject.flightApi.business.abstracts;

import java.util.List;

import javaproject.flightApi.entities.concretes.Flight;

public interface FlightService {
	List<Flight> getAll();
}
