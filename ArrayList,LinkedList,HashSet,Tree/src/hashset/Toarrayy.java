package hashset;
import java.util.*;
public class Toarrayy {
	public static void main(String[] args)
	{
		HashSet<String> set=new HashSet<String>();
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		System.out.println(set);
		Object [] arr=set.toArray();
		Iterator <String> itr=set.iterator();
		for(int j=0;j<arr.length;j++)
		{
			System.out.println("Array is"+" "+arr[j]);
		}
		
		
	}
}
