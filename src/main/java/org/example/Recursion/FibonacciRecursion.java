package org.example.Recursion;

public class FibonacciRecursion {
    // Recursive method to calculate Fibonacci sequence
    public static int fibonacci(int n) {
        if (n == 0) { // Base case
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }

    public static void main(String[] args) {
        int number = 10; // Change this value to generate more Fibonacci numbers
        System.out.print("Fibonacci series up to " + number + " terms: ");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
