package com.codegnan.model;

public class Warranty {
    private int id;
    private String productName;
    private String brand;
    private int warrantyYears;
    private String ownerName;
    // constructors, getters, setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getWarrantyYears() {
		return warrantyYears;
	}
	public void setWarrantyYears(int warrantyYears) {
		this.warrantyYears = warrantyYears;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public Warranty(int id, String productName, String brand, int warrantyYears, String ownerName) {
		super();
		this.id = id;
		this.productName = productName;
		this.brand = brand;
		this.warrantyYears = warrantyYears;
		this.ownerName = ownerName;
	}
}

