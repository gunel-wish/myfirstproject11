package day20;

public class SumOfOdd {

    public static void main(String[] args) {

     // 10 - 100 , use for Loop
     // hint : create a variable sum as int
     // loop throught 10 -100
     // in each iteration check  it's a even number or not
     //if it's add that number sum
     // eventually after the loop --->> print out sum value

        int sum = 0 ;

        for (int x = 10; x <= 100;   x++) {

            if ( x%2 == 1 ) {     // if ( x%2 != 0 )
               // System.out.println(x);
                sum = sum + x ;   // sum +=x ;
            }


        }

        System.out.println("sum = " + sum);








    }
}
