package javaproject.flightApi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaproject.flightApi.business.abstracts.FlightService;
import javaproject.flightApi.dataAccess.abstracts.IFlightRepository;
import javaproject.flightApi.entities.concretes.Flight;

@Service
public class FlightManager implements FlightService{
      private IFlightRepository flighttRepository;               
   	                                                           
      	@Autowired                                                 
      	public FlightManager(IFlightRepository flighttRepository)
      	{                                                          
      		this.flighttRepository = flighttRepository;               
      	}

		@Override
		public List<Flight> getAll() {
			return flighttRepository.findAll();  
		}
	    
	    
		        
      	                                                           
                      
                     
                      
                         
    
}