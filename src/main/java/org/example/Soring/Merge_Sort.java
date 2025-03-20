package org.example.Soring;


        // If the array has more than one element:
        // Find the middle index (mid).
        // Recursively call mergeSort on the left half.
        // Recursively call mergeSort on the right half.
        // Merge the two sorted halves using the merge function.

        // Total time complexity: O(n log n) (logarithmic-linear time).

public class Merge_Sort {


    public static class MergeSort {



        public static void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = left + (right - left) / 2;

                // Recursively sort the left and right arrays

                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);

                // Merge the sorted arrays
                merge(arr, left, mid, right);
            }
        }

        // Method to merge two sorted subarrays
        public static void merge(int[] arr, int left, int mid, int right) {
            // Sizes of two subarrays
            int n1 = mid - left + 1;
            int n2 = right - mid;

            // Temporary arrays
            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];

            // Copy data to temporary arrays
            for (int i = 0; i < n1; i++)
                leftArray[i] = arr[left + i];
            for (int j = 0; j < n2; j++)
                rightArray[j] = arr[mid + 1 + j];

            // Merge the two subarrays back into arr[]
            int i = 0, j = 0, k = left;
            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    arr[k] = leftArray[i];
                    i++;
                } else {
                    arr[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            // Copy remaining elements of leftArray[], if any
            while (i < n1) {
                arr[k] = leftArray[i];
                i++;
                k++;
            }

            // Copy remaining elements of rightArray[], if any
            while (j < n2) {
                arr[k] = rightArray[j];
                j++;
                k++;
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

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    }
}
