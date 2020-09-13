package com.gm.pcworld;

public class Mouse extends InputDevice{
	private final int mouseId;
	private static int mouseCounter;
	
	public Mouse(String brand) {
		super(brand);
		mouseId = ++mouseCounter;
	}
	
	public String toString() {
		return "Mouse: {brand: " + super.getBrand() + ", mouseId: " + mouseId +"}";
		
	}
}
