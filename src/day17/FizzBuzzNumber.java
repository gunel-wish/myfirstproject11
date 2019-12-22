package day17;

public class FizzBuzzNumber {
    public static void main(String[] args) {

        // if a number can be divided by both 3 and 5  --->> Fizz Buzz Number
        // if a number can be divided by 5             --->> Fizz number
        // if a number can be divided by 3             --->> Buzz number


        //   int num = 15 ;

        //    if ( num%5==0  && num%3==0) {
        //        System.out.println(num + " is Fizz Buzz Number");
        //    }else if (num%5==0) {
        //         System.out.println(num + "Fizz Number");
        //     }else if (num%3==0 ){
        //         System.out.println(num + "Buzz Number");
        //     }else {
        //        System.out.println(" NOT A FIZZ BUZZ AT ALL !!");
        //   }

        int num = 1;
        while (num <= 50) {
            if ( num%5==0  && num%3==0) {
                        System.out.println(num + " is Fizz Buzz Number");
                    }else if (num%5==0) {
                         System.out.println(num + " Fizz Number");
                     }else if (num%3==0 ){
                         System.out.println(num + " Buzz Number");
                     }else {

                   }
            ++num ;

        }


    }


}
