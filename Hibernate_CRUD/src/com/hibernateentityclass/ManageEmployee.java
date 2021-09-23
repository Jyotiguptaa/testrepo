package com.hibernateentityclass;

import java.util.ArrayList;
import java.util.List;

import com.hibernate.service.EmployeeService;

public class ManageEmployee {
	//UI client side
public static void main(String [] args)
{//post
	EmployeeService employeeServiceobj=new EmployeeService();
	Integer store=employeeServiceobj.addEmployee("ibrahiml", "hussain",38438);
					employeeServiceobj.addEmployee("manpreet", "kataria", 15368);		
	List <Integer> insert=new ArrayList <Integer>();
	insert.add(store);
	
	if(insert.size()!=0)
	{
		System.out.println("Recors are inserted");
	//	System.out.println(insert);
	}
	else
	{
		System.out.println("Recors are not inserted");
	}
	
	/* list employee records in database */
	try {
		employeeServiceobj.ListAllEmployee();
	} catch (Exception e) {

		e.printStackTrace();
	}
	
	/* update employee records in database */
	try {
		employeeServiceobj.updateEmployeeDetails(1, 90555);
	} catch (Exception e) {

		e.printStackTrace();
	}
	
	// delete

////////////////PUT request   id//////////////////////////////////////////

/* Method to update an employee in the database business logic */
	/* update employee records in database */
	try {
		employeeServiceobj.updateEmployeeDetails(3, 555);
	} catch (Exception e) {

		e.printStackTrace();
	}
	
	/* delete employee records in database by id */
	try {
		employeeServiceobj.deleteEmployeeDetailsById(2, 88438);
	} catch (Exception e) {

		e.printStackTrace();
	}
	
}


}
