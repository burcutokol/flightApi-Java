package javaproject.flightApi.entities.concretes;

import java.time.LocalDateTime;

public class Flight {
	private int Id;
	private String DepartureAirport;
	private String LandingAirport;
	 private LocalDateTime DepartureDateTime;
	 private LocalDateTime ReturnDateTime;
	 private double Price;
	
	  public Flight(int id, String departureAirport, String arrivalAirport, LocalDateTime departureDateTime, LocalDateTime returnDateTime, double price) {
	        this.setId(id);
	        this.setDepartureAirport(departureAirport);
	        this.setLandingAirport(arrivalAirport);
	        this.setDepartureDateTime(departureDateTime);
	        this.setReturnDateTime(returnDateTime);
	        this.setPrice(price);
	 }

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getDepartureAirport() {
		return DepartureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		DepartureAirport = departureAirport;
	}

	public String getLandingAirport() {
		return LandingAirport;
	}

	public void setLandingAirport(String landingAirport) {
		LandingAirport = landingAirport;
	}

	public LocalDateTime getDepartureDateTime() {
		return DepartureDateTime;
	}

	public void setDepartureDateTime(LocalDateTime departureDateTime) {
		DepartureDateTime = departureDateTime;
	}

	public LocalDateTime getReturnDateTime() {
		return ReturnDateTime;
	}

	public void setReturnDateTime(LocalDateTime returnDateTime) {
		ReturnDateTime = returnDateTime;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}
	

}
