package hashset;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args)
	{

		// Get the HashSet
		HashSet<String> setobj = new HashSet<>();
		setobj.add("Dil");
		setobj.add("Mange");
		setobj.add("More");
		setobj.add("For");
		setobj.add("Skill");

		System.out.println("HashSet: "+ setobj);

		// Convert the HashSet to TreeSet
		Set<String> hashSetToTreeSet= new TreeSet<>();
		hashSetToTreeSet.addAll(setobj);

		// Print the TreeSet
		System.out.println("TreeSet: "
						+ hashSetToTreeSet);
	}
}
