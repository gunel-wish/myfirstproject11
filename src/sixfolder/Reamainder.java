package sixfolder;

import java.util.Scanner;

public class Reamainder {

    public static void main(String[] args) {

        // + - * \   %
        // this is another operator along with others
        // it's called modulus or remainder operator
        //it will give you the remaining result after
        // two whole number division

        System.out.println(5/2);

       System.out.println( 5.0/2);

        System.out.println(5.0/ 2f);
        System.out.println("---- modulus , remainder-----");
        // 5 devided by 2 is 2 and remainder is 1
        // 2 * 2+ 1 = 5
        System.out.println(5%2);
        // 10*9+9=99
        System.out.println(99% 10);
        // 10 * 10+ 0 =100
        System.out.println(100%10);

        // declare a variable called minutes ,data type int
        // ask user to enter minutes as whole number
        // print the result in x hour y minutes format
        // for example 135 minutes , 2 hours 15 minutes

        Scanner scan = new Scanner (System.in);
        System.out.println("enter the minutes you want to convert");
        int minutes = scan.nextInt();  // 135 ; // 60*2+15


        int hourPart= minutes /60 ;  //135 / 60 ;   //--->>2
        int minsPart = minutes % 60; //135 %60;    //--->>15

        System.out.println("the minutes" +minutes+"hourPart"+ hourPart+"hours and" + minsPart+ "minutes");






    }




}
