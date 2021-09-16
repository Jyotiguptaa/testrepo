package linkedlistcollection;
import java.util.*;  
public class Appendlist{  
 public static void main(String args[]){  
  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  
  LinkedList<String> a2=new LinkedList<String>();
  a2.add("Barbie");
  a2.add("Anaconda");
  
  al.addAll(a2); //append
  System.out.println("After adding"+al);
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  