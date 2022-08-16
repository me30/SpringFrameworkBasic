package com.commons;

import java.util.List;

public class Triangle {

	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		for (Point point : points) {
			System.out.println("Points x:"+point.getX()+ " and y:"+point.getY());
		}
	}
}
