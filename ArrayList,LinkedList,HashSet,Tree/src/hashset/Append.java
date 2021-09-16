package hashset;
import java.util.*;
public class Append {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		set.add("mobiles");
		set.add("Crockery");
		set.add("Speakers");
		set.add("Headphones");
		set.add("Watch");
		
		HashSet<String> set2=new HashSet<String>();
		set2.add("Shoes");
		set2.add("Earpods");
		
		set.addAll(set2);
		System.out.println(set);
		
		

	}

}
