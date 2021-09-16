package hashset;
import java.util.*;
public class Clone {
	public static void main(String[] args) {
		
HashSet<String> set=new HashSet<String>();
set.add("House");
set.add("Bricks");
System.out.println(set);

HashSet <String> obj=new HashSet <String>();
obj=(HashSet)set.clone();
System.out.println(obj);
	}
}
