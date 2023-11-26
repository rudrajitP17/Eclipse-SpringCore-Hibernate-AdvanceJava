package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers1 
{
	@Id
	private int a_id;
	private String a_type;
	
	@ManyToOne
	private Question1 question;

	public int getA_id() {
		return a_id;
	}

	public void setA_id(int a_id) {
		this.a_id = a_id;
	}

	public String getA_type() {
		return a_type;
	}

	public void setA_type(String a_type) {
		this.a_type = a_type;
	}

	public Question1 getQuestion() {
		return question;
	}

	public void setQuestion(Question1 question) {
		this.question = question;
	}
}
