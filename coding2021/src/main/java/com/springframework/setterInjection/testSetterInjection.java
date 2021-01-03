package com.springframework.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSetterInjection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp1 = (Employee) context.getBean("obj");
		emp1.displayInfo();
	}
}
