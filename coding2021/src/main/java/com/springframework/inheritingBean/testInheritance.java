package com.springframework.inheritingBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class testInheritance {

	public static void main(String[] args) {
		ApplicationContext context = (ApplicationContext) new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp1 = (Employee) context.getBean("e2");		
		emp1.show();		
	}
}
