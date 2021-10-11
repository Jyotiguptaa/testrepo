package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Managestudent {
	@GetMapping("/studentlist")
	public Student_Attribute getstudentinfo()
	{
		Student_Attribute s1=new Student_Attribute(1,"Jyoti","343","Btech",344555);
		
//		s1.setId(1);
//		s1.setName("Jyoti");
//		s1.setRollno("2524");
//		s1.setCourse("Btech");
//		s1.setPhoneno(33333);
		return s1;
	}
}
