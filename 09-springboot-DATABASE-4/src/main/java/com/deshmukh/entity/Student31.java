package com.deshmukh.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student31 {
	
	
	public Student31() {
		System.out.println("Zero Parameterised Constructor");
	}
	
	public Student31(int id ,String name,long mobileno,long Adharno ) {    //Parametrised constructor
		this.id=id;
		this.name=name;
		this.Adharno=Adharno;
		this.mobileno= mobileno;
	}
	
	
	@Id
	private int id;
	private String name;
	private long mobileno;
	private long Adharno;
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
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public long getAdharno() {
		return Adharno;
	}
	public void setAdharno(long adharno) {
		Adharno = adharno;
	}
	
	// generate to String() /////////////////
	@Override
	public String toString() {
		return "Student31 [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", Adharno=" + Adharno + "]";
	}
	
	
	
	
	
	

}
