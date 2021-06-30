package com.ibm.fds.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int menuId;
	private int restId;

	private String name;
	private String description;
	private String category;
	private Double price;
	private boolean status;
	private String url;

	public int getRestId() {
		return restId;
	}

	public void setRestId(int restId) {
		this.restId = restId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Menu() {}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", price=" + price + ", status=" + status + "]";
	}

	public Menu(int menuId,int restId, String name, String description, String category, Double price, boolean status, String url) {
		super();
		this.menuId = menuId;
		this.restId = restId;
		this.name = name;
		this.description = description;
		this.category = category;
		this.price = price;
		this.status = status;
		this.url = url;
	}
	
}
