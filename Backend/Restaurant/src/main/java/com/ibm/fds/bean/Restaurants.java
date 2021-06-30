package com.ibm.fds.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurants {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int restaurantID;
	private String restaurantName;
	private String address;
	private String state;
	private String city;
	private String email;
	private String phone;
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getRestaurantID() {
		return restaurantID;
	}
	public void setRestaurantID(int restaurantID) {
		this.restaurantID = restaurantID;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Restaurants [restaurantID=" + restaurantID + ", restaurantName=" + restaurantName + ", address="
				+ address + ", state=" + state + ", city=" + city + ", email=" + email + ", phone=" + phone + "]";
	}
	public Restaurants() {}
	public Restaurants(int restaurantID, String restaurantName, String address, String state, String city, String email,
			String phone,String url) {
		super();
		this.restaurantID = restaurantID;
		this.restaurantName = restaurantName;
		this.address = address;
		this.state = state;
		this.city = city;
		this.email = email;
		this.phone = phone;
		this.url=url;
	}
	
	
}
