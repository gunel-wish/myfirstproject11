package day17;

public class EvenNumberFinder {

    // print all the even number backward from 100-0
    // try to use if statement rather than - 2

   // 100 - 98 - 96-94 -92 .....0

    public static void main(String[] args) {

        int x = 100;


            // add =, show 0 also
          while ( x>  0) {

              if( x%2 ==0) {
                  System.out.println(x + " is even number");
              }

              --x ;
          }



    }


}
