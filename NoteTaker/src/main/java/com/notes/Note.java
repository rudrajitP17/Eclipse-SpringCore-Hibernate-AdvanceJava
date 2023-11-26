package com.notes;

import java.util.Date;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notes")
public class Note 
{
	@Id
	private int id;
	private String type;
	private String content;
	private Date addedDateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getAddedDateTime() {
		return addedDateTime;
	}
	public void setAddedDateTime(Date addedDateTime) {
		this.addedDateTime = addedDateTime;
	}
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Note(String type, String content, Date addedDateTime) {
		super();
		this.id = new Random().nextInt(10000);
		this.type = type;
		this.content = content;
		this.addedDateTime = addedDateTime;
	}
	
	
}
