package tree;
import java.util.*;
public class Create {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> setcolor1=new TreeSet<String>();
		setcolor1.add("Orange");
		setcolor1.add("Black");
		setcolor1.add("Pink");
		setcolor1.add("Purple");
		setcolor1.add("Red");
		System.out.println(setcolor1);
		
		Iterator<String> itr=setcolor1.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }
	}
}

