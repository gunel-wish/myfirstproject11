package eightfolder;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {

        /*
        * Create a program to guess your favorite number
        * create a variable called myFavoriteNumber
        * Ask user to guess your favorite number
        * if user guessed right  300 then print BINGO !!
        * if not print  300 try again later
        *
        * */

        Scanner scan = new Scanner(System.in) ;


        System.out.println( " guess my favorite number :");
        int myFavoriteNumber = scan.nextInt() ;

        if ( myFavoriteNumber == 300 ) {
            System.out.println( " BINGO!!!");
        }else {
            System.out.println(" you are not my best friend , try again ");
        }









    }


}
