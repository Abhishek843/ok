package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {
     @Id
     @GeneratedValue
	 private int std_id;
	 private String name;
	 private int age;
	 private String address;
	public Student(int std_id, String name, int age, String address) {
		super();
		this.std_id = std_id;
		this.name = name;
		this.age = age;
		this.address = address;
		
	}
	
	
	public Student() {
		super();
	}


	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
	 
	 

}
