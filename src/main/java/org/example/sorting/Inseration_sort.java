package org.example.sorting;

        //Start from the second element (since the first element is already sorted).
        //Take the current element (key) and compare it with previous elements.
        //Shift elements greater than key to the right.
        //Insert key into its correct position.
        //Repeat this process for all elements.

          //Time Complexity: O(n) (linear time).


public class Inseration_sort {
    public static void insertionSort(int[] arr) {
        //int[] arr = {12, 25, 64, 22, 11};

        int n = arr.length-1;
        //n= arr.length = 5-1=4

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            //key= arr[2] = 12
            // The element to be inserted
            int j = i - 1;
            // j=2-1=1

            // Move elements of arr[0..i-1], that are greater than key, one position ahead


            //int[] arr = {12, 25, 64, 22, 11};
            while (j >= 0 && arr[j] > key) {
                // false && true = true
                arr[j + 1] = arr[j];
                // arr[0+1]=arr[0]
                //arr[1]=arr[0]
                //arr[1]=25

                j--;
                //j=-1
            }

            arr[j + 1] = key;
            //arr[-1+1]=12

            //arr[0]=key=12

            // Insert key at its correct position
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

        insertionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);

    }
}
