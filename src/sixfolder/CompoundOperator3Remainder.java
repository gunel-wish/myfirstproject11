package sixfolder;

public class CompoundOperator3Remainder {

    public static void main(String[] args) {


        int bankBalance = 1140 ;

        System.out.println(" i have spent the half of it" + bankBalance);
       //  bankBalance = bankBalance /2 ;
        bankBalance /= 2 ;
        System.out.println(" i now my bank balance " + bankBalance);

        // I want to divide balance by 500 and keep the remainder in my pocket
          bankBalance = bankBalance % 500 ; // 570 divided by 500 , remainder is 70;
          bankBalance%= 500 ;
        System.out.println( " i want to divide the balance  by 500 and keep the remainder in my pocket");
        System.out.println("the remainder is " + bankBalance);


    }






}
