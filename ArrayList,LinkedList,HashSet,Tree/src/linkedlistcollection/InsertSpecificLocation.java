package linkedlistcollection;

import java.util.Iterator;
import java.util.LinkedList;

public class InsertSpecificLocation {
	public static void main(String[] args)
	{
		LinkedList<String> state=new LinkedList<String>();
		state.add("Haryana");
		state.add("Up");
		state.add("Mumbai");
		state.add("Mannipur");
		state.add("Kerela");
		state.add(2,"Telangana");
		Iterator<String> itr=state.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
	}

	
}
