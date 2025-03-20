package org.example.Hashing;

import java.util.HashMap;

public class Hashmap_basics {


    // A HashMap internally uses an array of Node<K, V> objects, where each Node represents an entry in the map.


     public static void main(String[] args) {



                HashMap<Integer, String> map = new HashMap<>();

                // Insert elements
                map.put(1, "Apple");
                map.put(2, "Banana");
                map.put(3, "Cherry");

                // Retrieve element
                System.out.println("Value for key 2: " + map.get(2));

                // Remove an element
                map.remove(1);

                // Iterate over entries
                for (var entry : map.entrySet()) {
                    System.out.println(entry.getKey() + " -> " + entry.getValue());
                }
            }
        }








