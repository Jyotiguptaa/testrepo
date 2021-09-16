package com.example.demo;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class setrecord {
	Studentlist studentlist=new Studentlist();
	
	//Get callusing spring based web service
    @GetMapping("/studentinfo")
    public String sayHello()
    {
        
        return "Hello Jyoti";
    }
  //Retrieve person info using @get method
    @GetMapping("/personinfo")
    public Studentinfo getDummyStudent()
    {
        Studentinfo p=new Studentinfo();// person class object created
        p.setId(1);
        p.setName("jyoti@gmail.com");
        p.setCourse("Btech");
        p.setCgpa(8);
        p.setUniversity("Kurukshetra University");
        return p;
    }
    


    //Get call using spring based web service
    
    @GetMapping("/myurl")
    public String sayHello1()
    {
        return "hi how are you";
    }
    
    //Retrieve person info using @get method
      
        
        //Retrieve the person information by id
        @GetMapping("/studentforid/{id}")
        public Studentinfo getDummyPersonById(@PathVariable("id") Integer id)    
        {
        	Studentinfo p=new Studentinfo();
            p.getId();
            p.getName();
            p.getCourse();
            p.getUniversity();
            p.getCgpa();
            return p;
        }
      //Get list
        @GetMapping("/getlistofstudents")
        public List<Studentinfo> getDummyStudentList(){
        List<Studentinfo> listofstu=studentlist.getAllstudentlist();
        return listofstu;
        }
        //set list
        @GetMapping("/setstudentlist")
        public Studentinfo getstudentinfo() {
        	Studentinfo s=new Studentinfo();
        	s.setId(1);
        	s.setName("Jyoti");
        	s.setCourse("LLb");
        	s.setUniversity("Kuk");
         	s.setCgpa(9);
        	return s;
        	
        }
        Studentlist obj=new Studentlist();
        //add student
        @PostMapping(value="/insertstudent")
        public Studentinfo insertstudent(@RequestBody Studentinfo student)
        {
        	return obj.addstudent(student);
        }
        //update student
        @PutMapping(value="/updatestudent")
        public Studentinfo updatestudent(@RequestBody Studentinfo student)
        {
        	return obj.updateStudentinfo(student);
        	
        }
        //delete student
        @DeleteMapping("/deleterecord/{id}")
        public void deleteDummystudent(@PathVariable("id") Integer id) {
        obj.deletestudent(id);
        }
        
        
        
      	
        
        
       



    
   
    

}
