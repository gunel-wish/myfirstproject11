package sixfolder;

import java.util.Scanner;

public class NextLine_NextXMixtureProblem {

    public static void main(String[] args) {

        Scanner blala = new Scanner(System.in);


        System.out.println(" what is your name?");
        String name = blala.nextLine();
        System.out.println("your name is " + name);


        System.out.println(" what is your age?");
        int age = blala.nextInt();
        // String age = blala.nextLine();
        // notice we are not storing this into variable
        // we just want blow line to capture ENTER keyboard input
        // so that it does not accidentally get captured by
        // the nextLine we use to capture address
        blala.nextLine();
        System.out.println("your name is " + age);

        System.out.println("what is the address ?");
        String address = blala.nextLine();
        System.out.println(" your address is " + address);




    }




}
