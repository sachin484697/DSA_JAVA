package org.example.Hashing_implimenation;

class SimpleHashTable {
    private static final int SIZE = 10; // Size of the hash table
    private Entry[] table; // Array to store key-value pairs

    // Class to store key-value pairs
    static class Entry {
        int key;
        int value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor
    public SimpleHashTable() {
        table = new Entry[SIZE]; // Initialize array
    }

    // Hash function: key % SIZE
    private int hashFunction(int key) {
        return key % SIZE;
    }

    // Insert a key-value pair
    public void put(int key, int value) {
        int index = hashFunction(key);
        if (table[index] != null) {
            System.out.println("Collision detected at index " + index + "! Overwriting value.");
        }
        table[index] = new Entry(key, value); // Store in array
    }

    // Retrieve value by key
    public int get(int key) {
        int index = hashFunction(key);
        if (table[index] != null && table[index].key == key) {
            return table[index].value;
        }
        return -1; // Key not found
    }

    // Remove a key-value pair
    public void remove(int key) {
        int index = hashFunction(key);
        if (table[index] != null && table[index].key == key) {
            table[index] = null; // Delete entry
            System.out.println("Key " + key + " removed.");
        } else {
            System.out.println("Key " + key + " not found.");
        }
    }

    // Display the hash table
    public void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < SIZE; i++) {
            if (table[i] != null) {
                System.out.println("Index " + i + ": " + table[i].key + " -> " + table[i].value);
            } else {
                System.out.println("Index " + i + ": Empty");
            }
        }
    }

    // Main method to test the hash table
    public static void main(String[] args) {
        SimpleHashTable hashTable = new SimpleHashTable();

        hashTable.put(1, 100);
        hashTable.put(11, 200); // Collision occurs here
        hashTable.put(21, 300); // Another collision
        hashTable.put(2, 400);
        hashTable.display();

        System.out.println("Value for key 11: " + hashTable.get(11));

        hashTable.remove(11);
        hashTable.display();
    }
}
