package day23;

public class WarmUp_Array {
    public static void main(String[] args) {

      // create an int array of 7 items
      // assign values
      // 1, print out in reverse order
      //2, store last item in a variable called lastItem
                // print it out separately
        //3, print the item in the middle
        //
        // optionally : find sum , find average , find max , find min
        // double the value of each items in this array

        System.out.println("Hello");
        // first way to create an array objects and add value into index locations

        int[] nums = new int[7];
        nums[0] = 11 ;
        nums[1] = 2 ;
        nums[3] = 23 ;
        nums[4] = 4 ;
        nums[5] = 53 ;
        nums[6] = 6 ;



        // 2nd way to create an array with values already filled
        int [] nums2 = new int[] {11 , 2 ,34 , 4 , 53 , 6 ,3} ;

        // 3rd and shorest way
        //this must happen in one line , we can not declare first and assign later
        int[] nums3 = {11 , 2, 34 , 4 ,53 , 6 , 3} ;

        for (int x = nums.length-1; x >= 0; x--) {
            System.out.println("index  " +x + " : "  +nums[x]   );
        }
        int arraySize = nums.length;
        int lastItemIndex = arraySize-1 ;

        int lastItemValue = nums[lastItemIndex] ;
        System.out.println("last item value = " + lastItemValue);

      int middleItemIndex = arraySize/2 ;
        System.out.println( " middle item value = " + nums[middleItemIndex]);

int sum = 0;
        for (int x = 0; x <arraySize ; x++) {
            
          //  int currentItem = nums[x] ;
        //   sum = sum + currentItem ;
          sum = sum + nums[x] ;
        }
        System.out.println("sum = " + sum);

    }


}
