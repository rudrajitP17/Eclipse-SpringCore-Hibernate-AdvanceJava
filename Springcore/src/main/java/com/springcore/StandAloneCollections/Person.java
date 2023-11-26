package com.springcore.StandAloneCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person 
{
	private List<String> friends;
	private Map<String, Integer> fees;
	private Properties db;
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getFees() {
		return fees;
	}
	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}
	public Properties getDb() {
		return db;
	}
	public void setDb(Properties db) {
		this.db = db;
	}
}
