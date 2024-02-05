package javaproject.flightApi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaproject.flightApi.business.abstracts.AirportService;
import javaproject.flightApi.dataAccess.abstracts.IAirportRepository;
import javaproject.flightApi.entities.concretes.Airport;

@Service
public class AirportManager implements AirportService {
	private IAirportRepository airportRepository;
	
	@Autowired
	public AirportManager(IAirportRepository airportRepository)
	{
		this.airportRepository = airportRepository;
	}
	
	@Override
	public List<Airport> getAll()
	{
		return airportRepository.findAll();
	}
	

}
