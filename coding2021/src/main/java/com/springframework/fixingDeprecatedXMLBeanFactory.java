package com.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class fixingDeprecatedXMLBeanFactory {

	public static final String MODE = new String("map2");
	
	/*
	 * @see <a href="http://google.com">http://google.com</a>
	 */
	public static void main(String[] args) {	
		
		if(MODE.equals("not map")) {
			ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			Question q = (Question) context.getBean("question");
			q.displayInfo();	
		} else if(MODE.equals("map2")) {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			QuestionMap2 map = (QuestionMap2) context.getBean("questionmap-2");
			map.displayInfo();
		} else {
			// create the application context
			ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			
			// call the class
			QuestionMap map = (QuestionMap) context.getBean("question_map");
			
			// call the display info
			map.displayInfo();
		}
	}
}
