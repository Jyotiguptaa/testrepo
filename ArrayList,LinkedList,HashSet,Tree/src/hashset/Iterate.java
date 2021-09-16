package hashset;
import java.util.*;
public class Iterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <String> set=new HashSet<String>(); 
		set.add("one");
		set.add("two");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}

}
