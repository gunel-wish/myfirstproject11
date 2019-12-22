package day21;

public class WakeUpTask1_NamePrinter {
    public static void main(String[] args) {

        /*
        Given your name stored in a variable myName as String
For example : String  myName =Given your name stored in a variable myName as String
For example : String  myName = “My name is yourName here “

1, loop through each and every character print them out like this:
M->y  N->a->m->e  and so on
Put arrow it between the character
I calling you to use substring for  this task

Optionally
2, print the sentence by character at a time
      Just by incrementing by 1
3, print the sentence by  3 character at a time
4, print the sentence by 4 character at a time
         */
           //            0123456789012
         String myName ="Gulay Demirel" ;

         int charCount =myName.length() ;
        System.out.println("charCount = " + charCount);
         int lastCharIndex = charCount-1 ;
        System.out.println("lastCharIndex = " + lastCharIndex);

        // 01234
        // Hello
      //  System.out.println( myName.substring(0,1));      H
     //   System.out.println( myName.substring(1,2));      e
        //  System.out.println( myName.substring(2,3,));   l
        //   System.out.println( myName.substring(3,4));   l
        //   System.out.println( myName.substring(4,5));   o

        // 01234
        // Hello
        // int x =0 ;
        // System.out.println( myName.substring(x, x +1) );       ++x ; 1
        //   System.out.println( myName.substring(x, x+1) );      e
        // ++x ; 2
        //  System.out.println( myName.substring(x, x+1)  );     l
        // ++x ; 3
        //   System.out.println( myName.substring(x, x+1) );      l
        // ++x ; 4
        //   System.out.println( myName.substring(x, x+1) );      o

        System.out.println("---------");
        System.out.println("---1 ---- ");
        for (int x = 0; x <=lastCharIndex ; x++) {
          // for (int x  = 0; x <  charCount; x++) {
           String twoChar = myName.substring(x ,x+1) ;
            System.out.print(twoChar + "->");

        }

        System.out.println("---------");
        System.out.println("---2---- ");
        for (int x = 0; x <=lastCharIndex-1 ; x++) {
            // for (int x  = 0; x <  charCount; x++) {
            String twoChar = myName.substring(x ,x+2) ;
            System.out.print(twoChar + "->");
        }

        System.out.println("---------");
        System.out.println("---3---- ");
        for (int x = 0; x <=lastCharIndex-2 ; x++) {
            // for (int x  = 0; x <  charCount; x++) {
            String threeChar = myName.substring(x ,x+3) ;
            System.out.print(threeChar + "->");
        }

    }


}
