package com.example.demo;
//pojo class
public class Student_Attribute {
	public Student_Attribute()
	{
		super();
	}
	
	private int id;
	public Student_Attribute(int id, String name, String rollno, String course, double phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.course = course;
		this.phoneno = phoneno;
	}
	
	private String name,rollno,course;
	private double phoneno;
	
	
	
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
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(double phoneno) {
		this.phoneno = phoneno;
	}
	
}
