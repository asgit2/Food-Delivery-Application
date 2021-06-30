package com.ibm.fds.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ReserveTable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int reserveID;
	private String name;
	private String restaurantName;
	private String day;
	private String hours;
	private String noOfPersons;
	public int getReserveID() {
		return reserveID;
	}
	public void setReserveID(int reserveID) {
		this.reserveID = reserveID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public String getNoOfPersons() {
		return noOfPersons;
	}
	public void setNoOfPersons(String noOfPersons) {
		this.noOfPersons = noOfPersons;
	}
	@Override
	public String toString() {
		return "ReserveTable [reserveID=" + reserveID + ", name=" + name + ", restaurantName=" + restaurantName
				+ ", day=" + day + ", hours=" + hours + ", noOfPersons=" + noOfPersons + "]";
	}
	public ReserveTable() {}
	public ReserveTable(String name, String restaurantName, String day, String hours, String noOfPersons) {
		super();
		this.name = name;
		this.restaurantName = restaurantName;
		this.day = day;
		this.hours = hours;
		this.noOfPersons = noOfPersons;
	}
	
		
	
}
