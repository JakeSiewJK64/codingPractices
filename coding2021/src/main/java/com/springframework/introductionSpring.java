package com.springframework;

import java.io.File;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class introductionSpring {
	
	public static void main(String[] args) {
		String fpath = "applicationContext.xml";
		Resource resource = new ClassPathResource(fpath);
		BeanFactory factory = new XmlBeanFactory(resource);
		Student student = (Student) factory.getBean("studentbean");
		student.displayInfo();	
	}
}
