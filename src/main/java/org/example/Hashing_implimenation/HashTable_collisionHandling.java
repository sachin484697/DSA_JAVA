package org.example.Hashing_implimenation;

import java.util.LinkedList;

//Put (Insert) → O(1) (average),    O(n) (worst case with collisions)
//Get (Retrieve Value by Key) → O(1) (average),    O(n) (worst case)
//Remove (Delete Key-Value Pair) → O(1) (average),    O(n) (worst case)
//Display (Print All Entries) → O(n)

class HashTable_collisionHandling {
    private int size; // Size of the hash table
    private LinkedList<Entry>[] table; // Array of linked lists

    // Entry class to store key-value pairs
    static class Entry {
        int key;
        int value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor to initialize the hash table
    public HashTable_collisionHandling(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function: key % size
    private int hashFunction(int key) {
        return key % size;
    }

    // Insert key-value pair into the hash table
    public void put(int key, int value) {
        int index = hashFunction(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                entry.value = value; // Update existing key
                return;
            }
        }
        table[index].add(new Entry(key, value));
    }

    // Retrieve value associated with key
    public int get(int key) {
        int index = hashFunction(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return -1; // Key not found
    }

    // Remove key-value pair
    public void remove(int key) {
        int index = hashFunction(key);
        table[index].removeIf(entry -> entry.key == key);
    }

    // Display the hash table
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print("Index " + i + ": ");
            for (Entry entry : table[i]) {
                System.out.print("[" + entry.key + " -> " + entry.value + "] ");
            }
            System.out.println();
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        HashTable_collisionHandling ht = new HashTable_collisionHandling(10);

        ht.put(1, 100);
        ht.put(11, 200);
        ht.put(21, 300);
        ht.put(2, 400);
        ht.display();

        System.out.println("Value for key 11: " + ht.get(11));
        ht.remove(11);
        ht.display();
    }
}
