package JavaCollections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsets {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();

		// add(): duplicates are ignored
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(30);
		System.out.println("HashSet (no order guaranteed): " + set);

		// contains()
		System.out.println("contains(20): " + set.contains(20));
		System.out.println("contains(99): " + set.contains(99));

		// remove(Object)
		boolean removed20 = set.remove(20);
		System.out.println("remove(20): " + removed20 + " -> " + set);

		// size()
		System.out.println("size: " + set.size());

		// iteration (order is not fixed)
		System.out.print("for-each: ");
		for (Integer value : set) {
			System.out.print(value + " ");
		}
		System.out.println();

		System.out.print("iterator: ");
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// clear(), isEmpty()
		set.clear();
		System.out.println("after clear: " + set + " (isEmpty=" + set.isEmpty() + ")");
	}
}
