package com.commons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Drawing {

	public static void main(String[] arg) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t = (Triangle) context.getBean("triangle1");
		t.draw();
		
		System.out.println("#################################################");
		
		Triangle t1 = (Triangle) context.getBean("triangle2");
		t1.draw();
	}
}
