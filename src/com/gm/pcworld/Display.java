package com.gm.pcworld;

public class Display {
	private final int displayId;
	private String brand;
	private static int displayCounter;
	
	public Display() {
		displayId = ++displayCounter;
	}
	
	public Display(String brand) {
		this.brand = brand;
		displayId = ++displayCounter;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString() {
		return "Display: {displayId: " + displayId + ", brand: " + brand + "}";
	}
}
