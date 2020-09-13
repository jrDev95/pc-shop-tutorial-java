package com.gm.pcworld;

public class PC {
	private int computerId;
	private String name;
	private Display display;
	private Keyboard keyboard;
	private Mouse mouse;
	private static int pcCounter;
	
	public PC() {
		computerId = ++pcCounter;
	}
	
	public PC(String name, Display display, Keyboard keyboard, Mouse mouse) {
		this.name = name;
		this.display = display;
		this.keyboard = keyboard;
		this.mouse = mouse;
		computerId = ++pcCounter;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Display getDisplay() {
		return display;
	}
	
	public void setDisplay(Display display) {
		this.display = display;
	}
	
	public Keyboard getKeyboard() {
		return keyboard;
	}
	
	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	
	public Mouse getMouse() {
		return mouse;
	}
	
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
	public String toString() {
		return "PC: {\n"
				+ "\t computerId: " + computerId + ",\n"
				+ "\t name: " + name + ",\n"
				+ "\t keyboard: " + keyboard + ",\n"
				+ "\t mouse: " + mouse + ",\n"
				+ "\t display: " + display + ",\n"
				+"\t},";

	}
}
