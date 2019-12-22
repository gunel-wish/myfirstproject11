package out;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

      int counter = 0 ;
        int aCounter = 0 ;
        int bCounter = 0 ;
        int cCounter = 0 ;
        int dCounter = 0 ;
        int eCounter = 0 ;
        int fCounter = 0 ;
        int grade ;
        Scanner input = new Scanner(System.in) ;

        do {
            System.out.println(" please enter grade (_1 to exit): ");
            grade =input.nextInt();
            if (grade !=-1   && grade>=0 && grade<=100 ){
                aCounter++;
            if (grade>=80)
                    bCounter++;
                else if (grade>=70)
                    cCounter++;
                else if (grade>=60)
                    dCounter++;
                else if (grade>=50)
                    eCounter++;
                else
                    fCounter++;
            }else {
                System.out.println( " please enter a valid grade:");
            }



        }while (grade != -1) ;
        System.out.println("Total number of grades = " + (aCounter + bCounter + cCounter + dCounter + fCounter));
        System.out.println("Number of A's =" + aCounter);
        System.out.println("Number of B's =" + bCounter);
        System.out.println("Number of C's =" + cCounter);
        System.out.println("Number of D's =" + dCounter);
        System.out.println("Number of F's =" + fCounter);



    }



}
