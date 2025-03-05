package org.example.Searcing;

            //Best Case (Target found in the first step)
            //The middle element is the target.
            //Time Complexity: O(1) (constant time).

public class Searching {


        //Find the middle element of the array.
        //If the middle element is the target, return its index.
        //If the target is smaller than the middle element, search the left half.
        //If the target is larger than the middle element, search the right half.
        //Repeat steps 1-4 until the target is found or the search space is empty.


    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // Avoids exceeding limit of int
            int mid = left + (right - left) / 2;

            // if mid element is target
            // Check if target is found
            if (arr[mid] == target)
                return mid;

            // If target is greater, ignore left half
            if (arr[mid] < target)
                left = mid + 1;
            else // If target is smaller, ignore right half
                right = mid - 1;
        }
        // Target not found
        return -1;
    }


    public static void main(String[] args) {

            int[] arr = {2, 3, 4, 10, 40}; // Sorted array
            int target = 10;

            int result = binarySearch(arr, target);
            if (result == -1)
                System.out.println("Element not found");
            else
                System.out.println("Element found at index " + result);
        }



}
