package day20;

public class GetTwoSiblingChar {
    public static void main(String[] args) {
        // give me a String with value
        // print 2 character in one line as below example
        // for example : Ayra
       /*
         Ay 01--->>02
         yr 12--->>13
         ra 23-->> 24

        */
              //       0123
        String name = "Ayra" ;

     //   System.out.println( name.substring(2,4) );
     //   System.out.println( name.substring(3,5) );    // 3,4


        int lastCharIndex = name.length()-1 ;

      //  System.out.println(  name.substring(0,2) );
      //  System.out.println(  name.substring(1,3) );
      //  System.out.println(  name.substring(2,4) );


        for (int x = 0; x<= lastCharIndex-1 ; x++) {
            System.out.println( name.substring(x,x+2));
        }
                    //   0123
        // for example : Ayra
       /*
         Ayr 013--->>03
         yra 123--->>14


     //   System.out.println( name.substring(0,3) );
     //   System.out.println( name.substring(1,4) );

        */
        System.out.println("Getting 3 character : ");
        for (int x = 0;x<= lastCharIndex ; x++) {
            System.out.println( name.substring(x,x+3));

        }

    }



}
