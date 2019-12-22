package twelewfolder;

public class LoginTest_MainMethod {

    public static void main(String[] args) {

        // we can declare and assign value like this
        // if it's multiple varibles of same type
        String userName ="user123"  , password ="efg";
    //    System.out.println(! userName.equals("user123")) ;

       // user123 pass123

        if(userName.equals("user123")  && password.equals("pass123")){

            System.out.println("Login Successful");

        }else if (!userName.equals("user123")  &&  password.equals("pass123")){

            System.out.println("USERNAME NOT CORRECT");

      }else if(userName.equals("user123")  && !password.equals("pass123")) {

            System.out.println("PASSWORD NOT CORRECT");

        }else {

            System.out.println(" USERNAME AND PASSWORD  ARE BOTH WRONG");
        }






    }


}
