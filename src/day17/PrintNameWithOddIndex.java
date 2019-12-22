package day17;

import java.util.Scanner;

public class PrintNameWithOddIndex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in)   ;

        System.out.println("Enter you name !!");
        String name = scan.nextLine() ;

        int x = 0 ;
        // x<= name.length()-1  meaning
        // starting from 0 until last Index

        // x< name.length()  meaning ;
        // starting from 0 till right before the count

         while ( x< name.length()   ) {    // x <= name.length() -1 )

             if (x%2==1 ) {
                 System.out.println( name.charAt(x)   );
             }
            ++x;
         }





    }


}
