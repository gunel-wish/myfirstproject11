package day20;

public class FindDogInASentence {
    public static void main(String[] args) {

       // given sentence , find out the location of the dog
        //our approach is
        // doing through the sentence 3 character at a time
        // then if 3 character happen to be a dog, we print out the index

        /*
       0234567890123456789012345678901234567890123456
       I like dog , Dogs are cute , Dogs are friendly




         */

        String msg = "I like dog , Dogs are cute , Dogs are friendly" ;
        int lastCharIndex = msg.length()-1 ;

        for (int x = 0 ;  x<= lastCharIndex-2; x ++){

         String current3Chars = msg.substring(x, x+3 ) ;

       //   System.out.println(x + " : " +current3Chars );

            if ( current3Chars.equals("Dogs") ) {
                System.out.println("BINGO !!! AT " +   x);
            }


        }

    }
}
