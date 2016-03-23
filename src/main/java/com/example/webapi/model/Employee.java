package com.example.webapi.model;

public class Employee {
	private String name;
	private int age;
	
	public Employee() {
		this.setName("bank");
		this.setAge(12);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
