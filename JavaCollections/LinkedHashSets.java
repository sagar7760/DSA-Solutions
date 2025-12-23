package JavaCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();

		// add(): keeps insertion order; duplicates ignored
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("B");
		System.out.println("LinkedHashSet (insertion order): " + set);

		// contains()
		System.out.println("contains(B): " + set.contains("B"));

		// remove(Object)
		set.remove("A");
		System.out.println("after remove(A): " + set);

		// iteration preserves insertion order
		System.out.print("for-each: ");
		for (String value : set) {
			System.out.print(value + " ");
		}
		System.out.println();

		System.out.print("iterator: ");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		System.out.println("size: " + set.size());

		set.clear();
		System.out.println("after clear: " + set + " (isEmpty=" + set.isEmpty() + ")");
	}
}
