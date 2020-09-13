package com.gm.pcworld;

public class Keyboard extends InputDevice{
	private final int keyboardId;
	private static int keyboardCounter;
	
	public Keyboard(String brand) {
		super(brand);
		keyboardId = ++keyboardCounter;
	}
	
	public String toString() {
		return "Keyboard: {brand: " + super.getBrand() + ", keyboardId: " + keyboardId + "}";
	}
}
