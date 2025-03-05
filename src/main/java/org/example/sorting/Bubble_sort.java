package org.example.sorting;

public class Bubble_sort {


    //best - Time Complexity: O(n)
    //avg - Time Complexity: O(n²)

    //Outer Loop: Runs n-1 times, where n is the number of elements.
    //Inner Loop: Compares adjacent elements and swaps them if necessary.
    //Swapped Flag: Optimizes the algorithm by stopping early if no swaps occur in a pass.
    //Largest Elements Bubble to the End: The largest element is placed in its correct position in each pass.


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparisons
            // largest element shifts at end every time
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps occurred, the array is already sorted
            if (!swapped) break;
        }
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Unsorted array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);

    }
}
