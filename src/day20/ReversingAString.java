package day20;

public class ReversingAString {

    public static void main(String[] args) {

      // given a String variable name with value
      //reverse this name and store reversed valiue into
      // another String variable reversedName

                //   01234567
      String name = "White Walker" ;
      String reversedName = "";

        int lastCharIndex = name.length() -1 ;

        for (int x = lastCharIndex ; x >= 0 ; x--) {

            System.out.print( x + " index : ");

            char currenChar = name.charAt(x) ;
          System.out.println(  currenChar);

          reversedName = reversedName + currenChar ;

        }
      System.out.println(  "reversedName = " + reversedName);


      //      System.out.print( name.charAt(7) );
      //     System.out.print( name.charAt(6) );
      //      System.out.print( name.charAt(5) );
      //     System.out.print( name.charAt(4) );
      //     System.out.print( name.charAt(3) );
      //      System.out.print( name.charAt(2) );
      //     System.out.print( name.charAt(1) );
      //     System.out.print( name.charAt(0) );
      //      System.out.println();


    }

}
