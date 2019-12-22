package elevenfolder;

public class LocicalOperators {

    public static void main(String[] args) {
        // combining multiple togerge r

        // in java there is no range directly like math
        // for exaple int x = 70
        // in math :  60 < x < 100   ---- >> true < 100
        // in Java :  x > 60 && X < 100

        // &&  2 ampersand  , & 1 ampersand ------>> logical and operator
        // this is used to check both conditions are true at the same time

        // think about login example
        // only when your username


    /*
                      true      true
   *  int x = 70 ;   x > 60 && x < 100 ; true
                       false    true
   * int x = 10  ;   x > 60 && x< 100 ;   false
                       true     false
   * int x =110 ;    x > 60 && x< 100 ;  false
                       true     true
   * int x =99 ;     x> 60 && x < 100 ; true
     */
        System.out.println(" truth table ");

      //  System.out.println( true && true );
    //    System.out.println(false && true );
    //    System.out.println(true && false );
    //    System.out.println(  false && false);


       System.out.println(" result of true && true  is" +          (true && true)           );
       System.out.println(" result of false && true  is" +       (    false && true)         );
        System.out.println("result of true && false  is" +        (true && false)         );
        System.out.println("result of false && false  is " +    (false && false)      );

        System.out.println(" truth table ");

        System.out.println(" result of true || true  is" +    (true || true)         );
        System.out.println(" result of false || true  is" +   (false || true)        );
        System.out.println("result of true || false  is" +      (true || false)         );
        System.out.println("result of false || false  is " +      (false || false)      );

        // create a variable called num with type int
        // find out whether this number is more than 100 or less than 10

        // find out the number is within the range of 10 -60
        // and print out of result


        int x = 55 ;
        System.out.println( " ----- x> 100 || x< 10 ------");
        System.out.println( x> 100 || x< 10);
        System.out.println(" ----x>10   && x<60 ------");
        System.out.println( x>10   && x<60 );

        // more than 2 conditions at the same time , 3 conditions
                            //   true  ||  false ---->true
       System.out.println(" result of  true || false || false");
        System.out.println( true || false || false);
                            // true  && false ---->> false
        System.out.println(" result of true && true &&  false");
        System.out.println( true && true &&  false);
                            //false || false -> false ||| true --> true
        System.out.println( " running this   x==50  ||  x==51  ||         x==55 ");
        System.out.println( x==50  ||  x==51  ||         x==55      );

        // == is checking for equality , != is checking for inequality

        // check
        // check x is more than 50
        // and x is not equal  52
        // or x equal to 57
                             // true && true
                                        // true || false ---->> true
        System.out.println( x > 50 && x != 52  ||  x==57  );

        System.out.println( false  || true && true  );

    }

}
