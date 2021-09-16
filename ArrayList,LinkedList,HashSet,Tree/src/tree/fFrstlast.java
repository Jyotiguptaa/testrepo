package tree;
import java.util.*;
public class fFrstlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> set1=new TreeSet<String>();
//set store in alphabetic order
set1.add("Hello");
set1.add("World");
set1.add("Jyoti");
set1.add("Anjana");
System.out.println(set1);
System.out.println(set1.first());
System.out.println(set1.last());
	}

}
