package day21;

public class SearchingSomethingString2 {
    public static void main(String[] args) {
        String myName ="gulay demirel" ;

        int charCount =myName.length() ;
        System.out.println("charCount = " + charCount);
        int lastCharIndex = charCount-1 ;
        System.out.println("lastCharIndex = " + lastCharIndex);

        // Find out index of all the word an in case insensitive  manner
        // I will go through each and every letter of the String by 2 char
        //             ---->> each character i can use substring(0,2 ) and so on
        //            ----->> going to 0 to one character before last char index --->> for loop

        // when i am going througth each and every character
        //    i will check whether current character i am looking at
        // equals to < an> in case insensetive---->>>currentCharacter.equalsIgnoreCase("a")
        // if it is i will print the index println(the variable you use to keep the index)
        //if not--->>just move on
        //perform this action until i reach one  character before last character
        // because last chance to get 2 character is --->>
        System.out.println("---1 char ---- ");
        // for (int x  = 0; x <  charCount; x++) {
        for (int x = 0; x <=lastCharIndex-1; x++) {

            String  current2Char = myName.substring(x, x+2) ;
            if (current2Char.equalsIgnoreCase("ma")){

                System.out.println("The index of ma " + x);
            }

        }
        // for (int x  = 0; x <  charCount-3; x++) {
        for (int x = 0; x <=lastCharIndex-2; x++) {

            String  current2Char = myName.substring(x, x+3) ;
            if (current2Char.equalsIgnoreCase("ma")){

                System.out.println("The index of lia " + x);
            }

        }
    }


}
