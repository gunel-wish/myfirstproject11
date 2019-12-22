package day16;

public class WakeUpTask1_Reverse {
    public static void main(String[] args) {

        String word1 = "Java" ;
        String word2 = " " ;

        // in order to reverse a word , we need to take last character and put in first character
        // then put the second character at 1 location before first character

        // start getting character from last location till first location then save it

      //   word2 = " " + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0)  ;
        word2 +=word1.charAt(3) + "" + word1.charAt(2) + word1.charAt(1) + word1.charAt(0)  ;

        System.out.println( "word2 = " + word2);


        // i want to add word at the of it
         String msg = "Hello" ;
              //  msg = msg + " World" ;
                msg += " World !" ;
        System.out.println(" msg = " + msg);








    }
      /*
         *WAKE UP Task 1 :

         Give a word with 4 characters stored in a variable
          Stored in a String variable  word1k this world

           Create a String variable called word2
              Store the reversed word1 into word2
             And print out
           FOR EXAMPLE :
           Word1 ===> Java   ——>> word2   avaJ


— optionally ask this word from scanner
 */




}
