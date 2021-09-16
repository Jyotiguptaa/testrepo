package tree;
import java.util.*;
public class Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> set1=new TreeSet<String>();
//set store in alphabetic order
set1.add("Hello");
set1.add("World");
set1.add("Jyoti");
set1.add("Anjana");
set1.add("Anjani");
System.out.println(set1);
System.out.println(set1.clone());

	}

}
