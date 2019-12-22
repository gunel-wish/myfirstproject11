package day21;

public class OddNumberPrinterRepetition {

    public static void main(String[] args) {

       // count from 1 to 10 ---> print only odd numbers
        // repeat this 4 times




            for (int x = 0; x <=4 ; x++) {
                System.out.print("Iteration : " + x);

                for (int i = 1; i <=10 ; i++) {


                    if(i % 2 == 1) {
                        System.out.print(" - "  + i);
                    }

                }
                System.out.println();
            }



















    }


}
