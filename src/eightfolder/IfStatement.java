package eightfolder;

public class IfStatement {

    public static void main(String[] args) {

         int speedLimit = 60 ;

         int yourCurrentSpeed = 145 ;

        // if the yourCurrentSpeed is more than speed limit
        // get pulled over by the police
        // given ticket by the police
        // taken away some points on your license
        // go to court

        // INSIDE PARENTHESIS WE CAN ONLY PUT
        // BOOLEAN VALUE :true false
        // BOOLEAN VARIABLE
        // ANY EXPRESSION THAT RETURN BOOLEAN VALUE

        boolean IAmSpeeding =  yourCurrentSpeed > speedLimit ;
        // inside prentehetis we can only put
        // BOOLEAN VALUE : true , false
        // BOOLEAN VARIABLE
        // ANY EXPRESSION THAT RETURN BOOLEAN VALUE

        // if ( IAmspeeding ){
        //if( true) {
        if ( yourCurrentSpeed > speedLimit) {

            System.out.println("get pulled over by the police ");
            System.out.println(" given ticket by the police" );
            System.out.println(" taken away some points on your licence");
            System.out.println(" go you court");
        } else {
            System.out.println(" go shopping !!");
            System.out.println(" buy ice-cream !!");
            System.out.println(" enjoy your day !!");
        }

        System.out.println(" THE END ");


        // if not over the limit
        // go shopping !!

        // outside if statement , say the end





    }


}
