package elevenfolder;

public class LogicalNotOerator {

    public static void main(String[] args) {

        // LOGICAL NOT OPERATOR ! exclamation mark used to negate the boolean value


        // it can not be with any other data type other than boolean

         //  System.out.println( true );
      //  System.out.println( false );
        // first we can use it directly to boolean value like true and false
        System.out.println( "result of  ! true --->>  ") ;
        System.out.println( ! true );  // flip the coin and make it false
        System.out.println("result of   ! false --->>");
        System.out.println( ! false ); // flip the coin and make it true

        boolean isRecording = false ;
        System.out.println(" result of  ! isRecording");
        // second you can use it in front of a boolean variable and it will give oppositive value
        System.out.println( ! isRecording   );

       // third you can use it in front of a boolean expression
        // boolean expression is any expression that result in a boolean value
        // for example  7>5  ,  x>10  , y ==20 , x <=100  , x>y , x>10 && x<100

        System.out.println("result of !  (7>5)   is     ");
        System.out.println( !  (7>5));

        int x = 10 ;
        System.out.println( "result of x> 10 is "  );
        System.out.println(   x> 10   );
        System.out.println(" result of !(x>10) is ");
        System.out.println( !(x>10));

        //    !(x>10) --->>  x<=10



    }



}
