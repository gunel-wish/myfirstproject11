package fourteenthfolder;

public class EmailChecker {

    public static void main(String[] args) {

        /*Create a variable called email
        Check for blow conditions
       If it does not contain character @ say invalid email
       If it contain space say invalid email
      If it endsWith @gmail.com. —>>gmail
      If it endsWith @yahoo.com—>> yahoo email
      If it endsWith @mail.ru   ——>> Russian email
         */

        String email = "gun@yahoo.com" ;

       if ( !email.contains("@") ||  email.contains(" ")    ) {

           System.out.println("INVALID EMAIL");

       }else if ( email.endsWith("@gmail.com")  )  {

           System.out.println("Google mail");

       }else  if (email.endsWith("@yahoo.com")  ) {

           System.out.println("Yahoo Mail");

       }else if (email.contains("@mail.ru ")   ){

           System.out.println("Russian mail");
       }







    }



}
