package ninefolder;

public class LanguagePicker {
    public static void main(String[] args) {

        /**
         // Task 3

         Language Picker :
         // assume you are on the call and you have been given option to be greeted by the language of your choice according to the number you provided
         Create a variable called languageOption and assign value
         String variable called. Greeting , assign a empty String
         1 —>> “Hello”
         2—->> “Salam”

         3——>> “Hola”
         4——>>”Privet”

         5——>>”Merhaba”
         6——>> “ Szia”
         7——>>”Bonjour”

         The program  should set the value of a String variable called greeting
         To this value : 1 —>> “Hello , SDET “

         Print out ——>> This is how greeting massage you get :”Hello , SDET”
         */

        System.out.println(" Welcome to Cybertek call center");
        System.out.println(" please select your language option from 1-7  ");

        String greetingCode = " ";
        int languageOption = 4;

        if (languageOption == 1) {
            System.out.println(" Hello");
        } else if (languageOption == 2) {
            System.out.println(" Salam");
        } else if (languageOption == 3) {
            System.out.println("Hola");
        } else if (languageOption == 4) {
            System.out.println("Privet");
        } else if (languageOption == 5) {
            System.out.println("Merhaba");
        } else if (languageOption == 6) {
            System.out.println("Szia");
        } else if (languageOption == 7) {
            System.out.println(" Bounjor");
        } else {
            System.out.println("unknown");
        }
        // Hello , SDET


        System.out.printf(" the end");


    }


}
