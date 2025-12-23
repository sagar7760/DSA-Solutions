package JavaCollections;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMaps {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        // put(): keys are kept sorted (natural order)
        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");
        map.put(40, "D");
        map.put(20, "B-updated");
        System.out.println("TreeMap (sorted by key): " + map);

        // firstKey/lastKey
        System.out.println("firstKey(): " + map.firstKey());
        System.out.println("lastKey() : " + map.lastKey());

        // Navigable key lookups
        System.out.println("lowerKey(25)  : " + map.lowerKey(25));   // greatest key < 25
        System.out.println("floorKey(25)  : " + map.floorKey(25));   // greatest key <= 25
        System.out.println("ceilingKey(25): " + map.ceilingKey(25)); // smallest key >= 25
        System.out.println("higherKey(25) : " + map.higherKey(25));  // smallest key > 25

        // floor/ceiling entries
        System.out.println("floorEntry(25)  : " + map.floorEntry(25));
        System.out.println("ceilingEntry(25): " + map.ceilingEntry(25));

        // Range views (views are backed by the map)
        NavigableMap<Integer, String> head = map.headMap(30, true);   // keys <= 30
        NavigableMap<Integer, String> tail = map.tailMap(20, false);  // keys > 20
        NavigableMap<Integer, String> sub = map.subMap(10, true, 40, false); // 10 <= key < 40
        System.out.println("headMap(<=30): " + head);
        System.out.println("tailMap(>20) : " + tail);
        System.out.println("subMap(10..40): " + sub);

        // descending order
        System.out.println("descendingMap(): " + map.descendingMap());

        // pollFirstEntry/pollLastEntry (remove and return)
        Map.Entry<Integer, String> first = map.pollFirstEntry();
        Map.Entry<Integer, String> last = map.pollLastEntry();
        System.out.println("pollFirstEntry(): " + first);
        System.out.println("pollLastEntry() : " + last);
        System.out.println("after polls: " + map);

        map.clear();
        System.out.println("after clear: " + map + " (isEmpty=" + map.isEmpty() + ")");
    }
}
