package com.commons;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] arg) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle t = (Triangle) context.getBean("triangle");
		t.draw();
	}
}
