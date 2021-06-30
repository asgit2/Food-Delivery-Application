package com.ibm.fda.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String menuItem;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", menuItem=" + menuItem + ", price=" + price + "]";
	}
	public Cart() {}
	public Cart(int id, String menuItem, double price) {
		super();
		this.id = id;
		this.menuItem = menuItem;
		this.price = price;
	}
	
}
