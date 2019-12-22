package twelewfolder;

public class FizzBuzzNumberCheck {

    public static void main(String[] args) {

        /*
       * // create a class called FizzBuzzNumberCheck with main method
Given a number , create a variable int num
  If this number can be divided by 5 without remainder lets call it Fizz number
       For example : 5 , 15 ,25 , 100
  If this number can be divided by 3 without remainder lets print it BUZZ NUMBER
   For example : 3 , 15 , 9 ,27
  If this number can be divided by both 3 and 5 lets print FizzBuzzNumber
   For example : 15 ,  45 ,  30 , 90

If no mach , just say NOT MY NUMBER !!!!!!!!
        */

      int num =45;

      if(num%5==0 && num%3==0 ) {
          System.out.println(" Fizz Buzz Number ");
      }else if (num % 5==0) {
          System.out.println("Fizz Number");
      }else if (num%3==00 ) {
          System.out.println(" Buzz Number ");
      }else {
          System.out.println(" not my number");
      }






    }


}



