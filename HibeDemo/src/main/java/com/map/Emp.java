package com.map;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Emp 
{
	@Id
	private int e_id;
	private String e_type;
	@ManyToMany
	private List<Project> p;
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getE_type() {
		return e_type;
	}
	public void setE_type(String e_type) {
		this.e_type = e_type;
	}
	public List<Project> getP() {
		return p;
	}
	public void setP(List<Project> p) {
		this.p = p;
	}
}
