package com.example.demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Studentlist {
	
	static HashMap<Integer, Studentinfo> studentIdMap = getstudentIdMap(); //map list
    public Studentlist()
    {
        super();
        if (studentIdMap == null) {
        	studentIdMap= new HashMap<Integer, Studentinfo>();
            // Creating some objects of Person while initializing
           Studentinfo stu1 = new  Studentinfo(1, "ram", "Btech", "delhiUniv",8);
           Studentinfo stu2 = new  Studentinfo(2, "mohan", "BCA", "Kukuni",7);
           Studentinfo stu3 = new  Studentinfo(3, "sohan", "BBA", "ymca",6);
           Studentinfo stu4 = new  Studentinfo (4, "tarun", "MCA","andruni",5);

 

             //adding map list of collections in java
           studentIdMap .put(1, stu1);
           studentIdMap.put(2, stu2);
           studentIdMap.put(3, stu3);
           studentIdMap.put(4, stu4);
            }
        
    }
    public List<Studentinfo> getAllstudentlist() {
        List<Studentinfo> studentlist = new ArrayList<Studentinfo>(studentIdMap.values());
        return studentlist;
        }

 //get

         public Studentinfo getPerson(int id) {
        	 Studentinfo student = studentIdMap.get(id);
        return student;
        }
         
         
         
        // insert/add student
        public Studentinfo addstudent(Studentinfo student) {
        student.setId(getMaxId()+ 1);
        
        
        
        // key , value
        studentIdMap.put(student.getId(), student); ///logic class
        return student;
        }
        //update
        public Studentinfo updateStudentinfo(Studentinfo student) {
        if (student.getId() <= 0)
        return null;
        studentIdMap.put(student.getId(), student);
        return student;

 

         }
        
        
        //delete

 

         public void deletestudent(int id) {
        studentIdMap.remove(id);
        }

 

         public static HashMap<Integer, Studentinfo> getstudentIdMap() {
        return studentIdMap;
        }

 

         // Utility method to get max id
        public static int getMaxId() {
        int max = 0;
        for (int id : studentIdMap.keySet()) {
        if (max <= id)
        max = id;

 

         }
        return max;
        }
 
	
	

}
