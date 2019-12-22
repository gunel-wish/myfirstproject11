package day21;

public class NumberStairCade {

    public static void main(String[] args) {

     //   1234        // count from 1 to 4
     //   1234         // count from 1 to 4
     //   1234        // count from 1 to 4
     //   1234        // count from 1 to 4

      //  Do this 5 times
       for (int y = 1; y <=5 ; y++) {
         //  System.out.println("y : " + y);

           for (int x = 1; x <=y; x++) {
               System.out.print(" " + x);
           }
           System.out.println();

       }

        System.out.println("------");
        for (int x = 1; x <=1 ; x++) {
            System.out.print(" " + x);
        }
        System.out.println();

        for (int x = 1; x <=2 ; x++) {
            System.out.print(" " + x);
        }
        System.out.println();

        for (int x = 1; x <=3 ; x++) {
            System.out.print(" " + x);
        }
        System.out.println();

        for (int x = 1; x <=4 ; x++) {
            System.out.print(" " + x);
        }
        System.out.println();

        for (int x = 1; x <=5 ; x++) {
            System.out.print(" " + x);
        }
        System.out.println();





    }

}
