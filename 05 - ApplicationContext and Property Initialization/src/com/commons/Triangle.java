package com.commons;

public class Triangle {

	private String type;
	
	public void draw() {
		System.out.println("Triangle call :"+type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
