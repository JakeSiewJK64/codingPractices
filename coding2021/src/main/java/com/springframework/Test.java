package com.springframework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Test {

	public static void main(String[] args) {
		String classPath = new String("applicationContext.xml");
		
		Resource r = new ClassPathResource(classPath);
		System.out.println(r);
		
		// @Deprecated 
		BeanFactory factory = new XmlBeanFactory(r);
		System.out.println(factory);
		
		Question q = (Question)factory.getBean("question");
		q.displayInfo();
	}
}
