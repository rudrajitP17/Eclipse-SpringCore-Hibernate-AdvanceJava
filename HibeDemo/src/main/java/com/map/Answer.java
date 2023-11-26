package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer 
{
	@Id
	private int a_id;
	private String a_type;
	@OneToOne(mappedBy = "answer")
	private Question question;
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
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
}
