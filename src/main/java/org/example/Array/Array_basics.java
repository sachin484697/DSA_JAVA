package org.example.Array;

public class Array_basics {
    public static void main(String[] args) {

        // direct initialization
        int[] arr = {10, 20, 30, 40, 50};


        // static initialization
        int[] arr_1 = new int[10];
         arr[0]=1;
         arr[1]=2;


        //traversing array by traditional for loop
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // traversing array using for-each loop
        for( int num:arr){
            System.out.println(num);
        }
    }
}