package org.example.Recursion;

public class SumNaturalNumbers {
    public static int sum(int n) {
        if (n == 1) return 1; // Base case
        return n + sum(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        System.out.println(sum(5)); // Output: 15 (1+2+3+4+5)
    }
}

