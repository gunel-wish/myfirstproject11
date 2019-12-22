package eightfolder;

public class MultiBranchIfStatement2 {
    public static void main(String[] args) {

        // pseudo | sudo code
        /*
         * given your currentSpeed , speedLimit
         *
         * check whether the current speed is
         *
         * more than  90  -->> jail
         * more than 80 and less than or equal  90 -->> reckless driving
         * more than 70 and less than or equal  80 -->> point taken
         * more than 60 and less than or equal  70 -->> waring
         * if not speeding keep driving
         */

        int currentSpeed  =76 ;

        if( currentSpeed > 90 ){
            System.out.println(" jail time !!");
        }else if(currentSpeed > 80) {
            System.out.println(" reckless driving ");
        }else if ( currentSpeed>60) {
            System.out.println( " warining ");
        }else {
            System.out.println(" keep driving" );
        }
    }





}
