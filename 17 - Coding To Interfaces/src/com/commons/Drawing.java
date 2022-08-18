package com.commons;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] arg) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		
		Shape shape1 = (Shape) context.getBean("triangle");
		shape1.draw();
	}
}
