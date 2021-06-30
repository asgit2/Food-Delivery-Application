package com.ibm.fds.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	private String date;
	private int customerId;
	private int MenuId;
	private int quantity;
	private double totalprice;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getMenuId() {
		return MenuId;
	}
	public void setMenuId(int menuId) {
		MenuId = menuId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", date=" + date + ", customerId=" + customerId + ", MenuId="
				+ MenuId + ", quantity=" + quantity + ", totalprice=" + totalprice + "]";
	}
	public OrderDetails() {}
	public OrderDetails( String date, int customerId, int menuId, int quantity, double totalprice) {
		super();

		this.date = date;
		this.customerId = customerId;
		MenuId = menuId;
		this.quantity = quantity;
		this.totalprice = totalprice;
	}
	
	
}
