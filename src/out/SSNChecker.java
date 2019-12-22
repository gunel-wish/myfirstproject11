package out;

import java.util.Scanner;

public class SSNChecker {
    /*
    *divide this String to tree parts -- ok
    * divide this string to three parts
    * check each part is valid or not
    * if it is valid
    * display it is a valid number
    * else
    * display it is not valid number
    *
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.println(" Please enter your Social Security Number : ");
        String ssn = input.next();

        String firstPart = " " ;
        String secondPart = " " ;
        String thirdPart = " " ;

        boolean firstCondition = false ;
        boolean secondCondition  = false  ;
        boolean thirdCondition  = false  ;



        firstPart = ssn.substring(0, ssn.indexOf("-")  ) ;
        secondPart = ssn.substring(ssn.indexOf("-")+1 , ssn.lastIndexOf("-")  ) ;
        thirdPart = ssn.substring(ssn.lastIndexOf("-")+1 , ssn.length()  ) ;

        System.out.println("First part : " + firstPart);
        System.out.println("Second part : " + secondPart);
        System.out.println("Third part : " + thirdPart);

           if(firstPart.length()==3)
               firstCondition=true ;
        if(secondPart.length()==3)
            secondCondition=true ;
        if(thirdPart.length()==3)
           thirdCondition=true ;

        if ( firstCondition && secondCondition  && thirdCondition )
        System.out.println(ssn + "is a valid social security number");
        else
            System.out.println(ssn + " is an invalid social security number");


    }





}
