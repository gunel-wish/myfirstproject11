package day20;

public class WorkingWithMoreThanOneCharinString {

    public static void main(String[] args) {

        // give me a String with even number character count
        // print 2 character in one line
                 //       01234567
        // gor example :  Gokyuzum
        /*
        Go
        ky
        uz
        um
         */


     //   System.out.println(  name.substring(0,2) );
     //   System.out.println(  name.substring(2,4) );
    //    System.out.println(  name.substring(4,6) );
     //   System.out.println(  name.substring(6,8) );


     //   int x = 0 ;
    //    System.out.println(  name.substring(x,x+2)  );
   //     x = x+ 2 ;
   //     System.out.println(  name.substring(x,x+2)  );
   //     x = x+ 2 ;
   //     System.out.println(  name.substring(x,x+2)  );
     //   x = x+ 2 ;
   //     System.out.println(  name.substring(x,x+2)  );



        String name = "Gokyuzum" ;
        int charCount = name.length() ;
         int  lastCharIndex = charCount -1 ;
        // my condition is x<=charCount-2  or x<=lastCharIndex-1
      for ( int x = 0 ;  x<=lastCharIndex-1;  x+= 2 ) {
          System.out.println(  name.substring(x,x+2)  );
      }






    }

}
