import java.util.*;

public class LearnMap {
    public static void main(String[] args) {

        // 3. Map Example: HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(2, "Three");
        hashMap.putIfAbsent(1, "New One"); // Overwrites value for key 1
        System.out.println("Map (HashMap): " + hashMap);

        //  Example: LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");
        System.out.println("Map (LinkedHashMap - Order): " + linkedHashMap);

        //  Example: TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        treeMap.put(1, "One");
        System.out.println("Map (TreeMap - Sorted): " + treeMap);



        // Iterate Map
        System.out.println("\nIterating Map (HashMap):");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Iterate LinkedHashMap
        System.out.println("\nIterating Map (HashMap):");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Iterate TreeMap
        System.out.println("\nIterating Map (TreeMap - Sorted):");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
