package collection1;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Updateelement {
public static void main(String[] args)
{
	List<String> color=new ArrayList();
	color.add("Red");
	color.add("Yellow");
	color.add("Pink");
	color.add("Black");
	color.add("Red");
	color.set(1, "Green");//Update
	
Iterator<String> itr=color.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}


}
}
