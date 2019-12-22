package day15;

public class ReplaceMethod {
    public static void main(String[] args) {

         // replace method of the String
        //it will go through all part of string and replace

       String massage = "I love Pumpkin , Pumpkin is fun !" ;
       massage = massage.replace("Pumpkin" , "Java!") ;

        System.out.println(massage);

        String massage2 = " Happy Thanks Giving to all !" ;

        // Happy Thanks Giving to all  ----->> "Happy Thanksgiving to all !"

        massage2 = massage2.replace("Thanks Giving", "Thanksgiving") ;
        System.out.println("massage2 = " + massage2);

        massage2 = massage2.replace("!!", "!") ;
        System.out.println("massage2 = " + massage2);

            // remove all the space
        massage2 = massage2.replace(" " ,"") ;
        System.out.println( " massage2" + massage2);

        String massage3 = " tomorrow is off no !" ;

        System.out.println(massage3.replace("no " , " "));




      // what if i want replace space from everywhere


    }



}
