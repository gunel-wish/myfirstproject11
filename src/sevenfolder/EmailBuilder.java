package sevenfolder;

import java.util.Scanner;

public class EmailBuilder {
    public static void main(String[] args) {

      /*
      // create a class called EmailBuilder with main  method
      //  create 3 variable for first name and last name , company
      // create another variable for email
     // create email in this format firstNmae_lastName@company.com
      // print out result as , my name is < your full name > and I work for
      < company> and my email < email>

       */
        Scanner scan = new Scanner (System.in);


        System.out.println(" enter you first name , last name ,company separated by space : ");
        String firstName , lastName , company ,email ;
        firstName = scan.next() ; //" ferhad";
        lastName =scan.next() ;  //" alizada";
        company =scan.next() ;   // " uber " ;
        // firstName_lastName@company.com     ferhad_alizada@uber.com
        email = firstName + "_" + lastName +"@" +  company + ".com";

        System.out.println(" my name is "+ firstName + " "
                + lastName+ " and i work for "+ company + " and my email is " + email);








    }








}
