package elevenfolder;

public class WarmUp1_LightOnOff {

    public static void main(String[] args) {

        /**
         * Create class called WarmUp1_LightOnOff
         Create a variable : targetOption as String and assigning of below options for example bd

         You have 4 switches in your home to turn on
         Bd - bedroom
         Lr - living room
         Ki- kitchen
         Ha -Hallway

         Use switch statement to write a program to print which room light is turned on. For example Bd was targetOption
         Then print you have turned on bedroom light
         */

          String targetOption = " Lr" ;
         // what can be the data type of the variable inside switch
        // byte , short ,int , char , String

          switch ( targetOption) {

             // Bd - bedroom
            //  Lr - living room
           //   Ki- kitchen
            //  Ha -Hallway
              case "Bd" :
                  System.out.println( " you have turn on  bedroom light");
                  break;
              case "Lr" :
                  System.out.println( " you have turn on living room light");
                  break;
              case "Ki" :
                  System.out.println( "you have turn on  kitchen light");
                  break;
              case "Ha" :
                  System.out.println(" you have turn on hallway light");
                 break;
              default:
                  System.out.println(" Wrong Options");
                  break;

          }



    }


}
