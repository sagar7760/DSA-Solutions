package JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class Hashmaps {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // put(): add/update
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("B", 25); // update existing key
        System.out.println("HashMap (no order guaranteed): " + map);

        // putIfAbsent()
        map.putIfAbsent("D", 40);
        map.putIfAbsent("A", 999); // ignored because A already exists
        System.out.println("after putIfAbsent: " + map);

        // get(), getOrDefault()
        System.out.println("get(B): " + map.get("B"));
        System.out.println("getOrDefault(X, -1): " + map.getOrDefault("X", -1));

        // containsKey(), containsValue()
        System.out.println("containsKey(C): " + map.containsKey("C"));
        System.out.println("containsValue(40): " + map.containsValue(40));

        // replace()
        map.replace("C", 35);
        System.out.println("after replace(C,35): " + map);

        // remove(key) and remove(key,value)
        map.remove("D");
        boolean removedWrongPair = map.remove("B", 999);
        boolean removedRightPair = map.remove("B", 25);
        System.out.println("remove(D): " + map);
        System.out.println("remove(B,999): " + removedWrongPair + ", remove(B,25): " + removedRightPair + " -> " + map);

        // Iteration: entrySet(), keySet(), values()
        System.out.println("entrySet():");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + " = " + entry.getValue());
        }

        System.out.print("keySet(): ");
        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        System.out.print("values(): ");
        for (Integer value : map.values()) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("size: " + map.size());

        map.clear();
        System.out.println("after clear: " + map + " (isEmpty=" + map.isEmpty() + ")");
    }
}
