package day16;

import java.util.Scanner;

public class StringPractice {

    public static void main(String[] args) {

        String word1 = "Java" ;
        String word2 = " " ;

        // in order to reverse a word , we need to take last character and put in first character
        // then put the second character at 1 location before first character

        // start getting character from last location till first location then save it

        //   word2 = " " + word1.charAt(3) + word1.charAt(2) + word1.charAt(1) + word1.charAt(0)  ;
      //  word2 +=word1.charAt(3) + "" + word1.charAt(2) + word1.charAt(1) + word1.charAt(0)  ;
        // extra way to do this

        System.out.println( "word2 = " + word2);


        // i want to add word at the of it
        String msg = "Hello" ;
        //  msg = msg + " World" ;
        msg += " World !" ;
        System.out.println(" msg = " + msg);


        Scanner scan = new Scanner(System.in) ;
        System.out.println("enter the keyword to search");

        String keywordToSearch = scan.nextLine() ; // "Java"
        String tabTitle = keywordToSearch + " - Google Search" ;


        if ( tabTitle.startsWith( keywordToSearch )  && tabTitle.endsWith(" - Google Search ")  ) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }








    }


}
