package javaproject.flightApi.entities.concretes;

public class Airport {
	private int Id;
	private String CityName;
	
	public Airport() {
		
	}
	public Airport(int id, String cityName) {
		super();
		Id = id;
		CityName = cityName;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}

}
