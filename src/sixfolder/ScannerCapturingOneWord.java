package sixfolder;

import java.util.Scanner;

public class ScannerCapturingOneWord {

    public static void main(String[] args) {

        Scanner blala = new Scanner(System.in)  ;

        System.out.println("What is your name ? ");
        String name = blala.next();  // it will only capture first word ( separated by space)

        // String anotherWord = blala.next();
        int age = blala.nextInt() ;

        System.out.println(" You have entered  name " + name);
        //System.out.println(" Another word is"+ anotherWord);
        System.out.println(" You have entered age " + age);

    }



}
