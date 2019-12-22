package day15;

public class subStringPractice {
    public static void main(String[] args) {

     // getting  the part of the String out of another String
     //
      //                  0123456789012345
          String movie = "Lord Of The Ring" ;
          // Sub String will return part of another String
        // starting from beginning index until right before ending index

          String wordOf = movie.substring(5,7);
        System.out.println("wordOf = " + wordOf);
          //i want to get the String "Of"from this movie

        String wordThe = movie.substring(8,11) ;
        System.out.println(" wordThe = " + wordThe);

         // get  from the second word till last word !
        //                0123456789012345
      //  String movie = "Lord Of The Ring" ;
         // int startingPoint = movie.indexOf( " ") + 1 ;
        // int endingPoint = movie.length() ;
        // assume we already know the location   of starting point of second word
        // and the ending the sentences

        String secondWordTillLast = movie.substring(5,16 );
        System.out.println("secondWordTillLast = " + secondWordTillLast);

         String wordLordOf = movie.substring(0,7 ) ;
        System.out.println("wordLordOf = " + wordLordOf);


        // if you  want to start from somwhere and just get the rest of the string
        // above method will work , however there is even better method
        // if you provide only one parametr to dubstring method
        // it will just start from that location and get till the end

        String secondToLast = movie.substring(5) ;
        System.out.println( "secondToLast = " +secondToLast );

        // with this is mind: task          b
        // you know index already
        // reverse Lord Of The Ring --->> Ring Of The Lord

        String wordRing  = movie.substring(12) ;
        String wordOfThe = movie.substring(4,12) ;
        String wordLord = movie.substring( 0,4) ;

        System.out.println(  wordRing  + wordOfThe + "Java " + wordLord );



       // System.out.println(" second word till last : "
              //  + movie.substring(startingPoint,endingPoint)    );






    }


}
