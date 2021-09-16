package hashset;
import java.util.*;
public class Removeallement {
	public static void main(String[] args)
	{
		HashSet<String> set=new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		
		HashSet<String> set2=new HashSet<String>();
		set2.add("6");
		set2.add("7");
		set2.add("8");
		//before
		set2.addAll(set);
		System.out.println(set2);
		//after
		set2.removeAll(set);
		System.out.println(set2);
		
	}
}
