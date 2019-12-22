package fourteenthfolder.day14;

public class StringReview {

    public static void main(String[] args) {

        String  str = " I like pumpkin " ;
      //  System.out.println("str");
        System.out.println("str" + str);

       // contains :
        // it checks whether a string exists in another string
        // and return true or false result
        System.out.println(" does it contains pumpkin :" );
        System.out.println( str.contains("pumpkin")  );
                               // true
        boolean gotPumpkin = str.contains("pumpkin") ;

       // shortcut to print variable value in nice format soutv + tab
        System.out.println("gotPumpkin = " + gotPumpkin);

        // startsWith endsWith
       // check whether a string start with another string
        // check whether a string end with another string
        // and return true or false  result
        
        boolean startWithI = str.startsWith("I") ;
        System.out.println("startWith I " + startWithI);

        boolean endWithPumpkin = str.endsWith("pumpkin") ;
        System.out.println("endWithPumpkin " + endWithPumpkin);
        
        //  PASSWORD VALIDATOR






    }






}
