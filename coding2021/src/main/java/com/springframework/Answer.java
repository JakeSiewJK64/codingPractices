package com.springframework;

import java.util.Date;

public class Answer {
	private int id;
	private String answer;
	private Date postedDate;
	
	public Answer() {}
	
	public Answer(int id, String answer, Date postedDate) {
		this.id = id;
		this.answer = answer;
		this.postedDate = postedDate;
	}
	
	public String toString() {
		return "ID: " + this.id + "\nAnswer: " + this.answer + "\nPosted Date:" + this.postedDate + "\n";
	}
}
