package com.commons;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape{

	private Point center;
	
	@Override
	public void draw() {
		System.out.println("Circle: point is ("+center.getX()+", "+center.getY()+")");
	}

	public Point getCenter() {
		return center;
	}

	@SuppressWarnings("deprecation")
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}

}
