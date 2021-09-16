package tree;
import java.util.*;
public class Addatspecificloc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> setcolor1=new TreeSet<String>();
		setcolor1.add("Orange");
		setcolor1.add("Black");
		setcolor1.add("Pink");
		setcolor1.add("Purple");
		
		TreeSet <String> anotherone=new TreeSet<String>();
		anotherone.add("Yellow");
		anotherone.add("Green");
		
		anotherone.addAll(setcolor1);
		System.out.println(anotherone);
		
//		Iterator<String> itr=anotherone.iterator();  
//		  while(itr.hasNext()){  
//		   System.out.println(itr.next());  
//		  }
	}
}

