package com.map;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question1 
{
	@Id
	private int id;
	private String q_type;
	@OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
	private List<Answers1> answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQ_type() {
		return q_type;
	}
	public void setQ_type(String q_type) {
		this.q_type = q_type;
	}
	public List<Answers1> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answers1> answers) {
		this.answers = answers;
	}
}
