package javaproject.flightApi.dataAccess.abstracts;
import java.util.List;
import javaproject.flightApi.entities.concretes.Airport;

public interface IAirportRepository {
	List<Airport> getAll();
	
}
