package com.commons;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String[] arg) {
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Triangle t = (Triangle) beanFactory.getBean("triangle");
		t.draw();
	}
}
