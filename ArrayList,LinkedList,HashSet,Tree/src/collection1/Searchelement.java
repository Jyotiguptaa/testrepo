package collection1;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Searchelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> l1=new ArrayList();
        l1.add(0,"Jyoti");// Element at 1st index
        l1.add("Rahul");
        l1.add("Shyam");
        
        
       System.out.println( l1.get(1)); //Search Element
        
        //Traversing
        Iterator itr=l1.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
	}

}
