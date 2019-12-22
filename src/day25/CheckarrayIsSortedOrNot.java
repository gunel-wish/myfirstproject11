package day25;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckarrayIsSortedOrNot {
    public static void main(String[] args) {


      int []  nums = {13,31,8,5,21,2} ;

      System.out.println("num =" + Arrays.toString(nums));
      // storing the size of an array a variable
      int numsItemCount = nums.length;
      //i want to copy the content of nums array into the new array

       // creating an array with size as original array
     int [] numsCopy = new int[numsItemCount];  //numsCopy ;{0,0,0,0,0,}
  //      numsCopy[0] = nums[0] ;   //13 ; // coping one by one from original array
 //       numsCopy[1] = nums[1];
   //     numsCopy[2] = nums[2];
   //     numsCopy[3] = nums[3];
   //     numsCopy[4] = nums[4];
   //     numsCopy[5] = nums[5];

        for (int x =0; x<numsItemCount ; x++){
          numsCopy[x] = nums[x] ;
        }
        System.out.println("numsCopy = " + Arrays.toString(numsCopy));
         Arrays.sort(numsCopy) ;
      System.out.println("After sort numsCopy =" + Arrays.toString(numsCopy));
      // check whether the array still have  same content in same order after sorting

      if (Arrays.equals(nums, numsCopy)) {
        System.out.println("This Array is already sorted");
      }else{
        System.out.println("This Array is not already sorted");
      }

      // plain english logic to see a set of 7 number is shored or not
      // you copy this 7 number in another container
      // sort the number and check whether it still has same










    }




}
