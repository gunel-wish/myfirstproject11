package day25;

import java.util.Arrays;

public class String_SplitMethod {

    public static void main(String[] args) {

      String sentence = "I love Java" ;

      // what does it do?
        // split(bySomething) is a method of String that split string into mutiple part
        //

       String[] allWords = sentence.split( " ") ;

        System.out.println("allWords = "+ Arrays.toString(allWords)   );
        System.out.println("How many word do i have in this sentence ? : " + allWords.length    );

        // How do I get the last word of the sentence using this array i got from String
        System.out.println("Last word in this sentence is " + allWords[allWords.length-1]   );

      // are we limited to split by space or we can split by anything ?-->>anything
      String sentence2 ="Evrything is Awesome!!!" ;
      // split by letter e
        String[] split_e_Arr = sentence2.split("e");
        System.out.println("split_e_Arr = "+ Arrays.toString(split_e_Arr));

        for (String eachPiece : split_e_Arr) {
            System.out.println( "eachPiece =<" +eachPiece+ ">");
        }

           // split this sentence by i and print out your result


    }


}
