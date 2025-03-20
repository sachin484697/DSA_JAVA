package org.example.Sorting;

import java.util.Arrays;

public class Quick_sort_middlePivot {

    //sort({11, 12, 25, 22, 64},2,0)

    static  void sort(int[] nums,int hi,int low){
        //hi=2
        //low=0

        if(low >= hi){
            return ;
        }
        //{11, 12, 25, 22, 64}
        int start=low;// start =0
        int end=hi;//2
        int mid= start +(end-start)/2;//0+(4-0)/2  mid=2
        int pivot=nums[mid];//nums[2]=12
        //start=2
        //end=1

        while(start<=end){
            //int[] nums = {11, 12, 25, 22, 64};
            while(nums[start] < pivot){

                start++;
                //
            }
            while(nums[end]>pivot){
                //22>12
                end--;
                //2

            }
            if(start<=end){
                //1<=2
                //int[] nums = {11, 12, 25, 22, 64};
                int temp=nums[start];//25
                nums[start]=nums[end];//12
                nums[end]=temp;//25

                start++;//2
                end--;//1
            }
        }
        //int[] nums = {11, 12, 25, 22, 64};
        //sort(nums,0,1)
        sort(nums,low,end);
        //int[] nums = {11, 12, 25, 22, 64};
        //sort({11, 12, 25, 22, 64},2,0)
        sort(nums,start,hi);
    }

    public static void main(String[] args) {
        int[] nums = {64, 25, 12, 22, 11};
        sort(nums,nums.length-1,0);
        System.out.println(Arrays.toString(nums));

    }
}
