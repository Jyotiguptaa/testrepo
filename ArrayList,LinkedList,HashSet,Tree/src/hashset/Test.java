package hashset;
import java.util.*;
public class Test {
	public static void main(String[] args)
	{
		HashSet<String> set=new HashSet<String>();
		//before
		System.out.println(set.isEmpty());
		set.add("gg");
		set.add("gu");
		//after
		System.out.println(set.isEmpty());
		
		
	}
}
