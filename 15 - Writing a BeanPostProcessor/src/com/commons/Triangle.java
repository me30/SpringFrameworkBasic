package com.commons;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point A x:"+pointA.getX()+ " and y:"+pointA.getY());
		System.out.println("Point B x:"+pointB.getX()+ " and y:"+pointB.getY());
		System.out.println("Point C x:"+pointC.getX()+ " and y:"+pointC.getY());
		
	}
}
