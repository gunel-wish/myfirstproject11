package day22;

public class ArrayCreation2 {

    public static void main(String[] args) {

        int num;    // we are only declaring a variable
        num = 10;    /// we are only assigning a value

        // creating an array in second way

        int[] ages;
        // we assining a value on different line
        ages = new int[]{3, 5, 11, 33, 57, 18};

        int itemCount = ages.length;
        System.out.println("itemCount = " + itemCount);

        System.out.println("ages = " + ages);

        //  System.out.println(ages[0]);
        for (int x = 0; x < itemCount; x++) {

            System.out.println(ages[x]);

        }

     int[]   areaCodes =  {703, 300 , 954 , 665};
    //     int[] areaCodes ;
  //      areaCodes = {703, 300 , 954 , 665};

        for (int x = 0; x < areaCodes.length; x++) {
            System.out.println(areaCodes[x] + " " );
        }



    }

}
