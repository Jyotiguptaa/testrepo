package tree;
//Java program to illustrate lower() method
//of TreeSet class

import java.util.TreeSet;
public class Lower {
	public static void main(String args[])
	{
		TreeSet<Integer> tree = new TreeSet<Integer>();

		// Add elements to this TreeSet
		tree.add(10);
		tree.add(5);
		tree.add(8);
		tree.add(1);
		tree.add(11);
		tree.add(3);

		System.out.println(tree.lower(15));
	}
}
