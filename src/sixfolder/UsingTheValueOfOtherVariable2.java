package sixfolder;

import java.util.Scanner;

public class UsingTheValueOfOtherVariable2 {

    public static void main(String[] args) {


        // create a variable yourOrder ,type String and assign a value
        // create another variable  called myOrder and assign the value
        // to same value as yourOrder by copying
        // and just print them out

        Scanner input = new Scanner(System.in) ;
        System.out.println(" What is your order ? i want to the same");
        String yourOrder = input.nextLine() ;
        String myOrder = yourOrder ;

        System.out.println(" your order is " + yourOrder+"\n"  +  "my order is " + myOrder);









    }







}
