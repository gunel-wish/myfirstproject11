package sixfolder;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {

    public static void main(String[] args) {

        // Task 4
        // use nextLine to ask your bio
        // which city you live ,including state , Tyson ,VA
        // What is your street address

        Scanner blala = new Scanner((System.in));

        System.out.println ("What is your name ? ");
        // nextLine method of Scanner is used to capture whole line
        String name = blala.nextLine();
        System.out.println("you have entered " + name);

        System.out.println(" which city you live in , including state ?");
        String cityAndState = blala.nextLine();
        System.out.println(" you have entered " + cityAndState );

        System.out.println("what  is you  street address ? ");
        String streetAddress = blala.nextLine();
        System.out.println(" your street address" + streetAddress);
    }






}
