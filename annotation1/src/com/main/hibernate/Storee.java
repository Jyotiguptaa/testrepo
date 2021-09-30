package com.main.hibernate;
import org.hibernate.*;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernate.entity.*;

  
public class Storee {  
public static void main(String[] args) {  
    
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	
	SessionFactory factory=meta.getSessionFactoryBuilder().build();
	Session session=factory.openSession();
	
    Transaction t=session.beginTransaction(); 
	//setting some values  of employee say ravi
    Employees e1=new Employees();  
    e1.setName("Jyoti");
    e1.setEmail("Jyoti123@gmail.com");
    e1.setName("aayid");
    e1.getEmail();
     
    
	//setting some values  of employee ravi
    Addressemp address1=new Addressemp();  
    address1.setAddressLine1("Model Town 34");  
    address1.setCity("Chandigarh");  
    address1.setState("Punjab and Haryana");  
    address1.setCountry("India");  
    address1.setPincode(202355);  
      
    //setting employ to address
    e1.setAddress(address1);  
       //insert into db
    session.persist(e1);  
    t.commit();  
      
    session.close();  
    System.out.println("success....");  
}  
}  