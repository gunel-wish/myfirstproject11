package day21;

public class LoopControlStatement {
    public static void main(String[] args) {
        // break
        // if line contains break reaches the loop will stop !!!
        //      for (int i = 1; i <= 10; i++) {
        //           System.out.println(i);
        //         break ;
        //      }
        ///while iterating over 1 to 10
        // break out of the loop when it's 5

        //      for (int i = 1; i <= 10 ; i++) {
        //          System.out.println(i);
        //          if( i==5){
        //              break;
        //          }
        //      }


        // i want to keep adding money to my bank account from day 1 till day 10
        // day 1 i add 1 $
        // day 2 I add 2$
        //day 3 i add 3$
        //...
        //however my bank account can only hold 40$
        // so I need to stop adding money to i realize it can not hold
        // the money i am about put if the sum would go over 12


        int sum = 0 ;

        for (int x = 1; x <=10 ; x++) {

            System.out.println("current sum is " + sum);
            System.out.println("if I add " + x
                        + "dollar , it would be " + (sum + x) );
            // here we are checking whether agter adding the next number
            //it will go over 40 or not
            //that's why we should use sum +x to see whether it will go over before
            if( sum +  x > 12) {
                break;  // breaking out og the loop
            }
            // we need to the sum after we make sure it did not go over 40
            sum = sum +x ;
        }

        System.out.println("sum = " + sum);
        // continue
        // if line contains break reaches the loop will skip to next iteration

        // WE CAN USE break and continue for any type of loop


    }

}














