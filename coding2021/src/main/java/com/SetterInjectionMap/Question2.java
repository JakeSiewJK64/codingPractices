package com.SetterInjectionMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question2 {

	private int id;
	private String name;
	private Map<Answer, User> answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Answer, User> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Answer, User> answers) {
		this.answers = answers;
	}
	
	public void displayInfo() {
		System.out.println("Question id: " + id);
		System.out.println("Question Name: " + name);
		System.out.println("Answers...");
		
		// generate sets
		Set<Entry<Answer,User>> set = answers.entrySet();
		
		// create the iterator
		Iterator<Entry<Answer, User>> itr = set.iterator();
		
		while(itr.hasNext()) {
			// create entry
			Entry<Answer, User> entry = itr.next();
			Answer ans = entry.getKey();
			User usr = entry.getValue();
			
			System.out.println("Answer: " + ans + "\nBy: " + usr + "\n");	
		}	
	}
}
