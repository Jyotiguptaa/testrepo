package tree;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> set=new TreeSet<String>();
set.add("Hello");
set.add("World");
//Reverse using descending 
NavigableSet<String> treereverse=set.descendingSet();
System.out.println(treereverse);
Iterator<String> itr=treereverse.iterator();
while(itr.hasNext())
	System.out.print(itr.next());

	}

}
