package day22;

public class LoopControlStatement {

    public static void main(String[] args) {

      /*
      Print your name in reversed order

Store this sentence in a variable msg
I struggle with java I like  Java  I love Java  everything is awesome

Loop through each and every letter

1, print every other letter
Meaning : skip a letter each time you go through the letter
    0123456789
    I struggle with  ——>>Isrgl ih
Use continue for this task

2 , when you reach letter a break the loop
Optionally; break when you see 3rd A class insensitive


       */
     String msg = "I struggle with Java I like Java I love Java Everything is awesome" ;

        int charCount = msg.length();
        System.out.println("Character count = " + charCount);
      //  for (int idx = 0; idx <charCount-1 ; idx++) {
        for (int idx = 0; idx <charCount ; idx++) {

            if(idx % 2 ==1) {
                continue;
            }
            System.out.println( idx + " : " + msg.substring(idx , idx +1));

        }

           // task 2

        for (int idx  = 0; idx  < charCount; idx ++) {

           String currentChar = msg.substring(idx , idx+1) ;
           if (currentChar.equalsIgnoreCase("a") ) {
               break;
           }
            System.out.println("currentChar = " + currentChar);

        }

        // task  1 and 2 combined

        for (int idx  = 0; idx  < charCount; idx ++) {
            // this is the code to skip odd number index letter
         if (idx % 2 == 1) {
            continue; // this is checking the currentChar is J or j
            }
            String currentChar = msg.substring(idx , idx+1) ;
            if (currentChar.equalsIgnoreCase("J") ) {
                break;
            }
            //printing out index and the character at that index
            System.out.println( idx + "index " + " : currentChar =  " + currentChar);

        }




    }

}
