package com.gm.pcworld;

public class InputDevice {
	private String brand;
	
	public InputDevice(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString() {
		return "InputDevice: brand = " + brand;
	}
}
