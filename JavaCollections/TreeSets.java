package JavaCollections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();

		// add(): duplicates ignored, elements kept sorted (natural order)
		set.add(40);
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(20);
		System.out.println("TreeSet (sorted): " + set);

		// first/last
		System.out.println("first(): " + set.first());
		System.out.println("last() : " + set.last());

		// contains/remove
		System.out.println("contains(30): " + set.contains(30));
		set.remove(10);
		System.out.println("after remove(10): " + set);

		// Navigable methods
		System.out.println("lower(25)  : " + set.lower(25));   // greatest < 25
		System.out.println("floor(25)  : " + set.floor(25));   // greatest <= 25
		System.out.println("ceiling(25): " + set.ceiling(25)); // smallest >= 25
		System.out.println("higher(25) : " + set.higher(25));  // smallest > 25

		// Subsets (views)
		NavigableSet<Integer> head = set.headSet(30, true); // <= 30
		NavigableSet<Integer> tail = set.tailSet(30, false); // > 30
		NavigableSet<Integer> sub = set.subSet(20, true, 40, false); // 20 <= x < 40
		System.out.println("headSet(<=30): " + head);
		System.out.println("tailSet(>30) : " + tail);
		System.out.println("subSet(20..40): " + sub);

		// descending order view
		System.out.println("descendingSet(): " + set.descendingSet());

		// pollFirst/pollLast (remove and return)
		System.out.println("pollFirst(): " + set.pollFirst() + " -> " + set);
		System.out.println("pollLast() : " + set.pollLast() + " -> " + set);

		set.clear();
		System.out.println("after clear: " + set + " (isEmpty=" + set.isEmpty() + ")");
	}
}
