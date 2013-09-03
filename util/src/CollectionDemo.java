import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;


public class CollectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Microsoft");
		alist.add("Oracle");
		alist.add("Apple");
		alist.add("HP");
		
		
		System.out.println("-- Printing with for loop --");
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		
		System.out.println("-- Printing with foreach loop --");
		for (String elem : alist) {
			System.out.println(elem);
		}
		
		System.out.println("-- Printing with iterator --");
		Iterator<String> itr = alist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		LinkedList<String> lst = new LinkedList<String>();
		lst.add("Oracle");
		lst.add("JBoss");
		lst.add("Xerox");
		
		alist.addAll(lst);
		System.out.println("-- Printing Merged array list -- ");
		
		alist.add(4,"IBM");
		alist.remove(2);
		alist.set(6,"Apple");
		
		itr = alist.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		//  Convert ArrayList into a HashSet
		HashSet<String> hash = new HashSet<String>(alist);

		
		System.out.println("-- Printing hash set --");
		itr = hash.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		TreeSet<String> tree = new TreeSet<String>(hash);
		System.out.println("-- Printing Tree Set --");
		itr = tree.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
