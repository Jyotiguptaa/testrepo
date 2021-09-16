package tree;
import java.util.*;
public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer> set1=new TreeSet<Integer>();
//set store in alphabetic order
set1.add(1);
set1.add(2);
set1.add(5);
set1.add(9);
set1.add(11);

TreeSet<Integer> set2=new TreeSet<Integer>();
//set store in alphabetic order
set2.add(5);
set2.add(2);
set2.add(9);
set2.add(11);
set2.add(1);

Comparator comp=set1.comparator();
System.out.println("Since the Comparator value is: "+ comp);

Comparator comp2=set2.comparator();
System.out.println("Since the Comparator value is: "+ comp2);
	}

}
