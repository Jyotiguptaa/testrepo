package collection1;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Reverseelement{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> l1=new ArrayList();
        l1.add(0,"Jyoti");// Element at 1st index
        l1.add("Rahul");
        l1.add("Shyam");
        
        Collections.reverse(l1); //Reverse
        
        System.out.println(l1);
        //Traversing
        Iterator itr=l1.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
	}

}
