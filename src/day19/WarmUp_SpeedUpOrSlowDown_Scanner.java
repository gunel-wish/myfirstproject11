package day19;

import java.util.Scanner;

public class WarmUp_SpeedUpOrSlowDown_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Enter starting speed and ending speed ");



        int start = scan.nextInt();            //5 ;
        int end = scan.nextInt();          //  19 ;



        System.out.print("you have started at speed--->>  ");
        for (int i = start; i <=end ; i++) {

            System.out.print(i + ",");

        }





    }

}
