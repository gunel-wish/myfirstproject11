package day22;

public class ArrayPractice1 {
    public static void main(String[] args) {

   double[] prices = new double[5]  ;

        System.out.println(prices[0]);


        // can NOT print out array variable directly
        // to see what's inside
        System.out.println(prices);

       prices[0] = 2.46 ;
        prices[1] = 12.96 ;
        prices[2] = 992.1 ;
        prices[3] = 500 ;
        //what happen if i go over the range
        //run time error !!!!!!!
        prices[4] = 165.1 ;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(prices[4]);

        // create a char array that whole all the letter from your name
        // and assign values using each character of your first name

        // then print out each character
        char[] nameChar = new char[5] ;
        // what default value do we get for char array
        // we get a cahr represented by ascii code 0
        System.out.println("<" + nameChar[0] + ">");


        nameChar[0] = 'A' ;
        nameChar[1] = 'K' ;
        nameChar[2] = 'B' ;
        nameChar[3] = 'A' ;
        nameChar[4] = 'R' ;

        System.out.println(nameChar[0]   );
        System.out.println(nameChar[1]   );
        System.out.println(nameChar[2]   );
        System.out.println(nameChar[3]   );
        System.out.println(nameChar[4]   );
      // this will actually print the content of char array not memory address
        // and this only for char array, anything else will print memory address
       // System.out.println(nameChar);

     boolean[] yesNo = new boolean[3] ;
     System.out.println( yesNo[0]);
     System.out.println( yesNo[1]);
     System.out.println( yesNo[2]);

     yesNo[0] = true ;
     yesNo[1] =false ;
     yesNo[2] = true ;

     System.out.println( yesNo[0] );
     System.out.println( yesNo[1] );
     System.out.println( yesNo[2] );









    }


}
