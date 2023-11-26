package com.Rudra.HibeDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Learner 
{
	@Id
	private int id;
	private String city;
	private String Street;
	private Certificate certi;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
}
