package com.springframework;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMap {

	private int id;
	private String name;
	private Map<String, String> answers;
	
	public QuestionMap() {
		
	}
	
	public QuestionMap(int id, String name, Map<String, String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}	
	
	public void displayInfo() {
		
		// displaying the question details
		System.out.println("Question id: " + this.id);
		System.out.println("Question name: " + this.name);
		System.out.println("Question answers: ");
		
		// convert it to set first
		Set<Entry<String, String>> set = answers.entrySet();
		System.out.println("set: " + set);
		
		// declare iterator
		Iterator<Entry<String, String>> itr = set.iterator();	
		System.out.println("iterator: " + itr);
		
		// iterating through the key/value pair
		while(itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}	
	}
}
