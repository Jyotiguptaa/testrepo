package com.example.demo;

public class Studentinfo {
	
	private  String name;
	private String  course;
	private Integer cgpa;
	private String university;

	private Integer id;
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public Integer getCgpa() {
		return cgpa;
	}


	public void setCgpa(Integer cgpa) {
		this.cgpa = cgpa;
	}


	public String getUniversity() {
		return university;
	}


	public void setUniversity(String university) {
		this.university = university;
	}


	
	
	
    //parameterize constructor
    public Studentinfo(Integer id,String name,String course ,String university,Integer cgpa){
    
        super();
        this.id=id;
        this.name=name;
        this.course=course;
        this.university=university;
        this.cgpa=cgpa;
    }
	
    //parameterize constructor
    public Studentinfo(){
    
        super();
        this.id=0;
        this.name="";
        this.course="";
        this.university="";
        this.cgpa=0;
    }
}
	
	
	
	