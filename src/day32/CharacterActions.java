package day32;

public class CharacterActions {

    public static void main(String[] args) {

       // printAtoZ();
     //   printZtoA();

        printAlphabetInRange('a' ,'f');
        printAlphabetInRange('G' , 'B');
        printAlphabetInRange('A' ,'A');
        printAlphabetInRange('a','A');
        printAlphabetInRange('Z' , 'a');
    }

    public  static void printAlphabetInRange(char begining , char ending) {
// this comes before ending character mean begining character
        //assci
        if( begining<ending){
            System.out.println("we need to increment from" + begining  + "till" + ending);

            for (char iChar = begining; iChar <=ending ; iChar++) {
                System.out.print(iChar + " ");
            }
        }else if(begining>ending) {
            System.out.println("we need to decrement from" + begining + "till" + ending);
            for (char iChar = begining; iChar >=ending ; iChar--) {
                System.out.print(iChar + " ");
            }
            System.out.println();
        }else{
            System.out.print("they are same character");
        }



    }










      public static void printAtoZ() {

       for (char iChar = 'A'; iChar <='Z' ; iChar++) {
           System.out.print(iChar  + " ");
       }


       System.out.println();

         }

       public static void printZtoA() {

        for (char iChar= 'Z'; iChar >='A'; iChar--) {
        System.out.print(iChar + " ");
        }
          System.out.println();


         }






}
