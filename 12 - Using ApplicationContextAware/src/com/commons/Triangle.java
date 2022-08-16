package com.commons;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;

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

		ExtraBean beanExtra = (ExtraBean) context.getBean("extraBean");
		beanExtra.extraBeanMethod();
	}


	@Override
	public void setBeanName(String beanName) {
		System.out.println("BeanNameAware ::"+beanName);
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context =  context;
	}
}
