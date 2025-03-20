package org.example.Sorting;


        // Start with the first element (i = 0) as the minimum index.
        // Find the smallest element in the unsorted part of the array.
        // Swap the smallest element with the current element (arr[i]).
        // Move to the next position and repeat the process until the array is sorted.

        // Time Complexity: O(n²) (quadratic time) in all cases.



public class Selection_Sort {


    public static void selectionSort(int[] arr) {

        // initial array = int[] arr = {64, 25, 12, 22, 11};
        // iteration of outer loop
        // array after 1st itr =  int[] arr = {25, 64, 12, 22, 11}
        // array after 2nd itr =  int[] arr = {12, 25, 64, 22, 11}
        // array after 3rd itr =  int[] arr = {12, 22, 25, 64, 11}
        // array after 4th itr =  int[] arr = {11, 12, 22, 25, 64}


        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            // Assume the first element of the unsorted part is the minimum
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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

        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);

    }
}
