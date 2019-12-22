package day26;

public class SplitPractice {
    public static void main(String[] args) {

        // 2 additional String methods related to array
        // toCharArray() , another is Split ( bySomething )

        String survey = "B15 Online 1 month Survey" ;

        // how did determine to use char for each ??
        // because each item in char array is cha

        char[] surveyChars = survey.toCharArray() ;
         for ( char each : surveyChars ) {
             System.out.println("each char is : " + each);

         }

        // just for fun why don't we try while loop

        int x = 0;
         while ( x< surveyChars.length) {

             System.out.println("each char is : " + surveyChars[x]);
             x++;
         }

         // for fun do whilev

        int y  = 0 ;
        do{
            System.out.println("SurveyChar[y]" + surveyChars[y]     );
            y++ ;
        }while ( y<surveyChars.length) ;





    }

}
