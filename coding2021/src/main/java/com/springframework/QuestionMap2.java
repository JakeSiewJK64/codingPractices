package com.springframework;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class QuestionMap2 {

	private int id;
	private String name;
	private Map<Answer, User> answers;
	
	public QuestionMap2() {
		
	}
	
	public QuestionMap2(int id, String name, Map<Answer, User> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void displayInfo() {
		System.out.println("Question ID: " + this.id);
		System.out.println("Question Name: " + this.name);
		System.out.println("Answers: ");
		
		// declare set entry
		Set<Entry<Answer, User>> answers = this.answers.entrySet();
		
		// declare the iterator
		Iterator<Entry<Answer, User>> itr = answers.iterator();
		
		while(itr.hasNext()) {
			Entry<Answer, User> next = itr.next();
			Answer ans = next.getKey();
			User usr = next.getValue();
			
			System.out.println("Answer: " + ans);
			System.out.println("By: " + usr);			
		}
		
	}
}
