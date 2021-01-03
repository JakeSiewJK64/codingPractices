package com.springframework.setterInjectionWithCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testingSetterInjectionList {

	public static final String MODE = "collection2";
	
	public static void main(String[] args) {
		
		if(MODE.equals("collection")) {
			
			System.out.println("questionListListSetterInjection running...");
			// declaring application context
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
			Question question = (Question) context.getBean("questionListListSetterInjection");
			question.displayInfo();	
		} else {
			System.out.println("questionCollections2j running...");
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Question question = (Question) context.getBean("questionCollections2");
			question.displayInfo();
		}
	
		
	}
}
