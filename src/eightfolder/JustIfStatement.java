package eightfolder;

import java.util.Scanner;

public class JustIfStatement {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in) ;
        System.out.println(" What is your current speed , dear driver ");

        int currentSpeed = scan.nextInt();

        System.out.println("What is speed limit ");
        int speedlimit = scan.nextInt();



        if (currentSpeed >= speedlimit) {

            System.out.println(" get pulled over by the police");
            System.out.println(" given ticket by the police");
            System.out.println("taken away some points on your license");
            System.out.println("go to court");

        } // this is no else , program just move on



        System.out.println(" the end of the story !!! move on !!");





    }









}
