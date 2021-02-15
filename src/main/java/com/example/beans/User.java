package com.example.beans;

public class User {

	public Integer id;
	public String Name;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + "]";
	}
	
}
