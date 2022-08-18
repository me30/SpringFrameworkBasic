package com.commons;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape{

	private Point center;

	@Override
	public void draw() {
		System.out.println("Circle: point is ("+center.getX()+", "+center.getY()+")");
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name = "pointA")
	public void setCenter(Point center) {
		this.center = center;
	}

	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of Circle");
	}

	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of Circle");
	}

}
