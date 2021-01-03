package com.SetterInjectionMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setterInjectionMap1 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Question2 question = (Question2) context.getBean("q");
		question.displayInfo();
	}	
}
