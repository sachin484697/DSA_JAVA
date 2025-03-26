package org.example.Union_set;

import java.util.*;

class UnionFind {
    private int[] parent;
    private int[] rank;

    // Constructor to initialize the disjoint set
    public UnionFind(int size) {
        parent = new int[size];
        rank = new int[size];

        // Initialize each element as its own parent (single-element set)
        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 1; // Initial rank is 1
        }
    }

    // Find operation with Path Compression
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path Compression
        }
        return parent[x];
    }

    // Union operation (Merge two sets) using Union by Rank
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            // Attach the smaller tree under the larger tree
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }

    // Check if two elements belong to the same set
    public boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }

    // Print parent array for debugging
    public void printParents() {
        System.out.println("Parent Array: " + Arrays.toString(parent));
    }
}

// Driver Code
public class Union_set_implementation {
    public static void main(String[] args) {
        UnionFind uf = new UnionFind(7); // Create 7 elements (0 to 6)

        // Union operations (Merging sets)
        uf.union(1, 2);
        uf.union(2, 3);
        uf.union(4, 5);

        // Check connectivity
        System.out.println("Is 1 connected to 3? " + uf.isConnected(1, 3)); // true
        System.out.println("Is 1 connected to 4? " + uf.isConnected(1, 4)); // false

        // Perform another union operation
        uf.union(3, 4);

        // Now 1 and 4 should be connected
        System.out.println("Is 1 connected to 4 after union? " + uf.isConnected(1, 4)); // true

        // Display parent array
        uf.printParents();
    }
}

