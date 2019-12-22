package day19;

import java.util.Scanner;

public class WarmUp_SpeedUp_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter starting speed and ending speed ");

        int start = scan.nextInt();            //5 ;
        int end = scan.nextInt();          //  19 ;
        System.out.print("you have started at speed--->>  ");

        if ( start<end) {
            System.out.println("INCREASING SPEED");
            for (int i = start; i <=end ; i++) {
                System.out.print(i + ",");
            }
        }else if (start > end) {
            System.out.println("DECREASING SPEED");
            // i will decrease the speed till i reach ending speed
            for (int x = start; x >=end ; x--) {
                System.out.print(x + ",");

            }
        }else {
            System.out.print("NO ACTION NEEDED !!  SAME SPEED !!!");
        }





    }

}
