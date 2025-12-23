package JavaCollections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // put(): preserves insertion order when iterating
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("B", 25); // updates value, key stays in same position
        System.out.println("LinkedHashMap (insertion order): " + map);

        // putIfAbsent()
        map.putIfAbsent("D", 40);
        map.putIfAbsent("A", 999);
        System.out.println("after putIfAbsent: " + map);

        // get(), getOrDefault()
        System.out.println("get(C): " + map.get("C"));
        System.out.println("getOrDefault(X, -1): " + map.getOrDefault("X", -1));

        // containsKey(), containsValue()
        System.out.println("containsKey(B): " + map.containsKey("B"));
        System.out.println("containsValue(40): " + map.containsValue(40));

        // replace()
        map.replace("C", 35);
        System.out.println("after replace(C,35): " + map);

        // remove()
        map.remove("D");
        System.out.println("after remove(D): " + map);

        // iteration order is insertion order
        System.out.println("entrySet() iteration:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + " = " + entry.getValue());
        }

        System.out.println("size: " + map.size());

        map.clear();
        System.out.println("after clear: " + map + " (isEmpty=" + map.isEmpty() + ")");
    }
}
