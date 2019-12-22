package day22;

public class MUltiplicationTable {
    public static void main(String[] args) {

      //  System.out.println("1 x 1 = " + 1 * 1);
     //   System.out.println("1 x 2 = " + 1 * 2);
      //  System.out.println("1 x 3 = " + 1 * 3);

        //   System.out.println(" 2x 1 = " +  * 2);
        //   System.out.println("2 x 2 = " + 2 * 2);
        //  System.out.println("2 x 3 = " + 2 * 3);

        System.out.println("Multiplacation table of 1 ");
        for (int base = 1; base <=12 ; base++) {

            //  System.out.println("1 x 1 = " + 1 * 1);
            System.out.println("1 x " + base + " = " + 1 * base);
        }

        System.out.println("Multiplacation table of 2 ");
        for (int base = 1; base <=12 ; base++) {

            System.out.println("2 x " + base + " = " + 2 * base);
        }


        System.out.println("Multiplacation table of 3 ");
        for (int base = 1; base <=12 ; base++) {

            System.out.println("3 x " + base + " = " + 3 * base);
        }
        System.out.println("--------");

        /*
        *plain english logic
        * write a code to generate multiplication table of 1 number
        *
         */








        // this loop is for iterating from 1 to 10 get multiplaction table
        for (int timeTable = 1; timeTable <=10 ; timeTable++) {
         // i want to know which number i want to get the multiplacation table
            System.out.println("Multiplacation table of " + timeTable);
          // this loop will genareate multiplication table for one number
            for (int base = 1; base <=12 ; base++) {
                System.out.println( timeTable +" x " + base + " = " + timeTable * base);
            }



        }






    }


}
