package com.Rudra.HibeDemo;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate 
{
	private int course;
	private int duration;
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}
