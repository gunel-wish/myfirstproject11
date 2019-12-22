package twelewfolder;

public class WarmUp_SeasonFinder {
/*
*Create a class called WarmUp_SeasonFinder:

Create a variable called month with data type int
And write an if else if else statement to do following

If the month is less than 1nor more than 12 —->>INVALID MONTH
If the month is between 3-5 print it’s Spring
If the month is between 6-8 print it’s Summer
If the month is between 9-11 print it’s Fall
If the month is 12,1,2 print it’s Winter
 */
// tell number a number than 2 or less than 6
    // <= and =< , are they same thing
    public static void main(String[] args) {

       int month =3 ;

       if(month >12 || month<1){
           System.out.println("INVALID MONTH");
       }else if ( month>=3 && month<=5) {
           System.out.println(" Spring");
       }else if ( month>=6 && month<=8) {
           System.out.println("Summer");
       }else if (month>8  && month<12){
           System.out.println("Fall");
          //if month 12 //true \\ false  \\ false
       }else if( month==12 ||month==1  || month==2 ) {
           System.out.println("Winter");
       }
         // since first condition is already taking out
        //invalid situation , we do not need else in this
        // else in general is optional











    }



}
