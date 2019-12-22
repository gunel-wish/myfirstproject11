package twelewfolder;

import java.util.Scanner;

public class SeasonChecer {
    public static void main(String[] args) {
        /**
         * Create a String variable season
         *
         * Assign value by asking user question :Enter you season Please !!
         *
         * Check the season using if statements without caring about the case
         * If Spring—>Hiking, Novruz , clergy season , cool weather
         * If Summer—>Pool , Swimming , Beach , Vacation
         * If Fall —> barbecue, riding bike , JUST CODE !!! HOLLEWEN
         * If winter—>CODE!!! Ski, snowman , sledding
          */

        Scanner scan = new Scanner((System.in)) ;
        System.out.println("enter your season please");
        String season = scan.next() ;

        if (season.equalsIgnoreCase("spring")) {
            System.out.println("Hiking, Novruz , clergy season , cool weather");
        }else if( season.equalsIgnoreCase("summer")) {
            System.out.println("Pool , Swimming , Beach , Vacation");
        }else if (season.equalsIgnoreCase("fall")) {
            System.out.println("barbecue, riding bike , JUST CODE !!! HOLLEWEN");
        }else if (season.equalsIgnoreCase("winter")) {
            System.out.println("CODE!!! Ski, snowman , sledding");
        }else{
            System.out.println("NO VALID!!1");
        }





    }





}
