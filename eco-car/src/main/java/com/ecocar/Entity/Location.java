package com.ecocar.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location")

public class Location {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	int id;
	@Column(name = "city")
	String city;
	@Column(name = "country")
	String country;
	@Column(name = "latitude")
	String latitude;
	@Column(name = "longitude")
	String longitude;
	
	public Location() {
		
	}

	public Location(int id, String city, String country, String latitude, String longitude,
			Company company) {
		this.id = id;
		this.city = city;
		this.country = country;
		this.latitude = latitude;
		this.longitude = longitude;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
}
