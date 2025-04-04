// #303 -- Given an integer array nums, handle multiple queries of the following type:
Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:
NumArray(int[] nums) Initializes the object with the integer array nums.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).


class NumArray {
    
    int arr[]; //declaration of prefixsum array

    public NumArray(int[] nums) { // NumArray Initializes the object with the integer array 

        arr=new int[nums.length]; // initilization of array 
        //[-2, 0, 3, -5, 2, -1]
         
        for(int i=0;i<nums.length;i++){

            arr[i]=nums[i]; 

            if(i>0){
                arr[i]=arr[i]+arr[i-1]; //for calculating prefix sum
            }
        //   0  1  2 3  4  5
        }//[-2,-2, 1 ,-4,-2,-3]
        
    }
    
    public int sumRange(int left, int right) {// [2, 5]
    //[-2,-2,1,-4,-2,-3]

       if(left>0){

        return arr[right]-arr[left-1];//sum of integers between left and right 

       }
       return arr[right]; //numArray.sumRange(0, 2) -- return (-2) + 0 + 3 = 1
        }
        //input array-->[-2, 0, 3, -5, 2, -1]] range arrays--> [0, 2], [2, 5], [0, 5]]
        
    
    }
    



// # 525 -- Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

    class Solution {
    // consider 0->-1 and  1->1 
    //hashmap(sum,index )

    public int findMaxLength(int[] nums) {
        //[0,1,1,1,1,1,0,0,0]
       
        int ans=0;
        //6  //max length of  sub array

        Map <Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        //map.put(-1,0) 
        //map.put(1,2)
        //map.put(2,3)
        //map.put(3,4) 
        //map.put(4,5) //initially put 0 occurs 1 times at -1 index
        // if have to calculate from frist index sum must be repeted with frist-1 index
        int sum = 0;    //for prifix sum array

        for(int i=0 ; i < nums.length ; i++){
            if(nums[i]== 0){
                sum+= -1;
            }else if(nums[i]==1){
                sum+= +1;
                //1
            }

            if(map.containsKey(sum)){
                int idx=map.get(sum); 
                //int idx= map.get(1)
                //int idx = 2
                // if present get currnt index
                int length=i-idx; // calculate length using currnt and last occuring index 
                if(length>ans){
                    ans=length;
                }
            }else{
                map.put(sum,i);
                  //if not present put in map 
            }
        }
     return ans;   
    }
}


