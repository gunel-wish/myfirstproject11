package day22;

public class LoopingThrougthAnArray {

    public static void main(String[] args) {

// creating an array object with empty space
        int [] scores = new int [4] ;
        // assigning value to each index
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        // accessing the elements inside array one by one
      //  System.out.println( scores[0]     );
      //  System.out.println( scores[1]     );
      //  System.out.println( scores[2]     );
     //   System.out.println( scores[3]     );

        // how do we get size of any array object
        // array object has a property called length
        // array variable length will give you the count of items
        int itemCount = scores.length ;
    int lastItemIndex = itemCount - 1 ;

    // for (int x = 0; x <=lastItemIndex ; x++) {
    // for (int x = 0; x <=itemCount-1 ; x++) {
        for (int x = 0; x <itemCount ; x++) {

            System.out.println(scores[x]   );
        }
         // print this array in reverse order



    }

}
