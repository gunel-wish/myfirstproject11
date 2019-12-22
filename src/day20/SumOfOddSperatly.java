package day20;

public class SumOfOddSperatly {

    public static void main(String[] args) {
        // 10 - 100 , use for Loop
        // hint : create a variable sumOfOdd and sumOfEven  as int
        // loop throught 10 -100
        // in each iteration check  if Iit's a even number or not
        //      // t's add that number
        //
        // eventually after the loop --->> print out sum value

        int sumOfEven = 0 ;
        int  sumOfOdd  = 0 ;

        for (int i = 10; i <= 100; i++) {
            //
            // if it's even number , add that to sumOfEven
            if( i % 2 ==0){
                sumOfEven = sumOfEven + i ;
                // if it's even number , add that to sumOfOdd
            }else{
                sumOfOdd = sumOfOdd + i ;
            }


        }

        System.out.println("sumOfOdd = " +   sumOfOdd );
        System.out.println("sumOfEven = " +  sumOfEven );
    }

}
