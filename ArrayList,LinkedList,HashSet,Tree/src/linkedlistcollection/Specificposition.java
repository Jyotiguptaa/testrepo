package linkedlistcollection;
import java.util.*;  
public class Specificposition{  
 public static void main(String args[]){  
  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  
   
  Iterator<String> p=al.listIterator(2);
  while(p.hasNext()){  
   System.out.println(p.next()); 
   
   }  
 }  
}  