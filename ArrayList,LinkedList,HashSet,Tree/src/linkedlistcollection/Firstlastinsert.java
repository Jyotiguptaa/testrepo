package linkedlistcollection;
import java.util.*;
public class Firstlastinsert {
	public static void main(String[] args)
	{
		LinkedList<String> city=new LinkedList<String>();
		city.add("Ambala");
		city.add("Panipat");
		
		city.add("Chandigarh");
		city.add("Karnal");
		city.addFirst("FirstGoa");
		city.addLast("LastPune");//doubt
		
		
		Iterator<String> itr=city.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
