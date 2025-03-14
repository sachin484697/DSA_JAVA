package org.example.sorting;

        //Choose a pivot
        //Move all elements smaller than the pivot to the left.
        //Move larger elements to the right.
        //Place the pivot in its correct position.
        //Recursively apply Quick Sort to left and right partitions.


         // Best and Average Case (O(n log n))
         // Worst Case (O(n²))


public class Quick_Sort_lastPivot {

    // quick sort
    //time complexity

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find partition index
            int partitionIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    // Method to partition the array
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choosing the last element as pivot
        int i = low - 1;   // Pointer for the smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) { // If current element is smaller than pivot
                i++; // Move the smaller element index forward
                swap(arr, i, j);
            }
        }

        // Swap pivot with the element at (i+1) to place it at the correct position
        swap(arr, i + 1, high);
        return i + 1; // Return the partition index
    }

    // Utility method to swap elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);




    }
}
