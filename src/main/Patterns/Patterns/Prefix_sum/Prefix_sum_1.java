package Patterns.Prefix_sum;

public class Prefix_sum_1 {

    // #303 -- Given an integer array nums, handle multiple queries of the following type:
    // Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
    // Implement the NumArray class: NumArray(int[] nums) Initializes the object with the integer array nums.
    // int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right
    // inclusive (i.e. nums[left] + nums[left+1] + ... + nums[right]).


    //class NumArray {
    //
    //int arr[]; //declaration of prefixsum array
    //
    //public NumArray(int[] nums) { // NumArray Initializes the object with the integer array
    //
    //    arr=new int[nums.length]; // initilization of array
    //    //[-2, 0, 3, -5, 2, -1]
    //
    //    for(int i=0;i<nums.length;i++){
    //
    //        arr[i]=nums[i];
    //
    //        if(i>0){
    //            arr[i]=arr[i]+arr[i-1]; //for calculating prefix sum
    //        }
    //    //   0  1  2 3  4  5
    //    }//[-2,-2, 1 ,-4,-2,-3]
    //
    //}
    //
    //  public int sumRange(int left, int right) {// [2, 5]
    //[-2,-2,1,-4,-2,-3]
    //
    //   if(left>0){
    //
    //    return arr[right]-arr[left-1];//sum of integers between left and right
    //
    //   }
    //   return arr[right]; //numArray.sumRange(0, 2) -- return (-2) + 0 + 3 = 1
    //    }
    //}
}





