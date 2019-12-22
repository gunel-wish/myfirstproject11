package thirteenthfolder;

public class StringMethod {
    public static void main(String[] args) {

       // String actions that we already know so far

       // equals
      String s1 = "hello" ;
       System.out.println(   s1.equals("abc")   );
       //equalsIngnorecase
       System.out.println(s1.equalsIgnoreCase("HELLO")  );

      // toUpperCase method of String is used to make String all character uppercase
        System.out.println( s1   );
       System.out.println(  s1.toUpperCase()       );

      // toLoweCase method of String is used to make string all character lowerCase
      System.out.println(  s1.toLowerCase()  );


      // store your name into a variable
        // print your name in all uppercase
        // you may optionally concatenate  " MY NAME IS : YOUR NAME
        //print your name in all lowercase
        // you may optionally concatenate " MY NAME IS : YOUR NAME
     //   String s1 =  "Gunel" ;
      //  System.out.println( s1.equalsIgnoreCase("Gunel")  );

     //   System.out.println(s1);
     //   System.out.println( s1.toUpperCase());
    //    System.out.println( s1.toLowerCase());



        // in order to get how many character we have inside String
        // we can use length method of String
        // it will count each and every
        System.out.println(   s1.length()  );

        int lengthOfStr = s1.length() ;

        if ( lengthOfStr > 4) {
            System.out.println(" more than 4 character");

        }else {
            System.out.println(" not more than 4");
        }



    }




}
