package day22;

public class ArrayIntro {
    public static void main(String[] args) {

        // syntax for creating variable to store single item
        // and assigning value
        //dataType variableName = value here
        int num1= 10 ;
        System.out.println( "num1 = " + num1);
        // syntax for creating to store multiple itemks
        // and assigning value
        // dataType [] variableName = new dataType{count of item]
       // this array can hold 4 item , it's also known as array size

        // creating an array object with empty space
        int [] scores = new int [4] ;
       // assigning value to each index
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        System.out.println( scores[0]     );
        System.out.println( scores[1]     );
        System.out.println( scores[2]     );
        System.out.println( scores[3]     );

        // updating the value at certain index
        scores[1] =99 ;
        System.out.println(scores[1]);

        // once array is created with certain size , we can not change the size !!

       // when you create new array object
        // it will get default value in each element
        int[ ] numbers = new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

         // create an byte array with size 4
        // and store it into a variable called data
        byte[] data = new byte[4];
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        data[3] = 40;

        // assign value for each index location
        //print out the values at each index
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        // update last index value
        data[3] = 127 ;
        // then print it out
        System.out.println(data[3]);

















    }


}
