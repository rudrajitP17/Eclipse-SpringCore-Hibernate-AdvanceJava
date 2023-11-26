package com.map;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project 
{
	@Id
	private int p_id;
	private String p_type;
	@ManyToMany
	private List<Emp> emp;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	public List<Emp> getEmp() {
		return emp;
	}
	public void setEmp(List<Emp> emp) {
		this.emp = emp;
	}
	
}
