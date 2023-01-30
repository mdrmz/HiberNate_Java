package com.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "city")

public class city {

	@Id
	@Column(name= "ID")
	private int id;
	@Column(name= "name")
	private String name;
	@Column(name= "countryCode")
	private String countryCode;
	@Column(name= "distrcit")
	private String distrcit;
	@Column(name= "population")
	private int population;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrcit() {
		return distrcit;
	}
	public void setDistrcit(String distrcit) {
		this.distrcit = distrcit;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

}
