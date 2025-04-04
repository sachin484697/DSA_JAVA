package Patterns.Prefix_sum;

public class Prefix_sum_2 {

    // # 525 -- Given a binary array nums, return the maximum length of a contiguous subarray
    // with an equal number of 0 and 1.

    // class Solution {

    //public int findMaxLength(int[] nums) {
    //    //[0,1,1,1,1,1,0,0,0]
    //
    //    int ans=0;
    //    //6  //max length of  sub array
    //
    //    Map <Integer,Integer> map = new HashMap<>();
    //    map.put(0,-1);
    //    //map.put(-1,0)
    //    //map.put(1,2)
    //    //map.put(2,3)
    //    //map.put(3,4)
    //    //map.put(4,5) //initially put 0 occurs 1 times at -1 index
    //    int sum = 0;    //for prefix sum array
    //
    //    for(int i=0 ; i < nums.length ; i++){
    //        if(nums[i]== 0){
    //            sum+= -1;
    //        }else if(nums[i]==1){
    //            sum+= +1;
    //            //1
    //        }
    //
    //        if(map.containsKey(sum)){
    //            int idx=map.get(sum);
    //            //int idx= map.get(1)
    //            //int idx = 2
    //            // if present get current index
    //            int length=i-idx; // calculate length using current and last occurring index
    //            if(length>ans){
    //                ans=length;
    //            }
    //        }else{
    //            map.put(sum,i);
    //              //if not present put in map
    //        }
    //    }
    // return ans;
    //}
    //}
}
