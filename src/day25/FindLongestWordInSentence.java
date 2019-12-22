package day25;

import java.util.Arrays;

public class FindLongestWordInSentence {

    public static void main(String[] args) {

        String sentence = "We all love Java coding intensivaly " ;
        String[] allWords = sentence.split(" ") ;
        System.out.println("allWords = " + Arrays.toString(allWords)  );

        String longestWord = "" ;
        int maxCharCount = 0 ;

        // first create a variable longestWord to store my result
        // also create maxCharCount variable to store my longest char count
        // I want to go throught each and every word in String array
        // and check

   // String longestWord  = allWords[0] ;


        for (String currentWord : allWords) {
         //   System.out.println("currentWord = " + currentWord);
            if( currentWord.length() > longestWord.length()  ) {
                longestWord = currentWord ;

            }
        }

        System.out.println("longestWord =" + longestWord);
    }

}
