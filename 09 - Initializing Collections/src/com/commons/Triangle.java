package com.commons;

import java.util.List;

public class Triangle {
	
	private List<Point> listPoint;
	
	public List<Point> getListPoint() {
		return listPoint;
	}

	public void setListPoint(List<Point> listPoint) {
		this.listPoint = listPoint;
	}

	public void draw() {
		for (Point point : listPoint) {
			System.out.println("x:"+point.getX() + " and y:"+point.getY());
		}
	}
}
