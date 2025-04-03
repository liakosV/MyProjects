package CodingFactoryTasks.hashExamples;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Adding key-value pairs
        map.put("Coke", 80);
        map.put("Apple", 100);
        map.put("Banana", 50);
        map.put("Cherry", 500);
        map.put("Cherry", 400); // If you duplicate the key takes the new value.

        // Retrieving a value using a key
        System.out.println("Price of Banana: " + map.get("Banana")); // 50

        System.out.println("Price of Cherry: " + map.get("Cherry"));

        // Checking if a key exists
        System.out.println("Contains 'Apple'? " + map.containsKey("Apple")); // true

        // Removing an entry
        map.remove("Cherry");

        // Iterating through the HashMap
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}

