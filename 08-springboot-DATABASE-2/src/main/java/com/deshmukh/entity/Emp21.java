package com.deshmukh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emp21 {
	
	
	@Id
	private int id;
	private String name;
	private double mobileno;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMobileno() {
		return mobileno;
	}
	public void setMobileno(double mobileno) {
		this.mobileno = mobileno;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Emp21 [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", salary=" + salary + "]";
	}
	
	
	
	
	

}
