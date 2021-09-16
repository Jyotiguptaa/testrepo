package collection1;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Sortinglist {
public static void main(String[] args)
{
	List<String> color=new ArrayList();
	color.add("Red");
	color.add("Yellow");
	color.add("Pink");
	color.add("Black");
	color.add("Red");
	//before list
	System.out.println(color);
	//after sort
	Collections.sort(color);
	
	System.out.println(color);
//Iterator<String> itr=color.iterator();
//while(itr.hasNext())
//{
//	System.out.println(itr.next());
//}


}
}
