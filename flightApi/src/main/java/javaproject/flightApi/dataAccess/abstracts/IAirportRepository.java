package javaproject.flightApi.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javaproject.flightApi.entities.concretes.Airport;

public interface IAirportRepository extends JpaRepository<Airport, Integer>{
	
}
