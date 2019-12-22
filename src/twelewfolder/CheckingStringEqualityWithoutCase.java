package twelewfolder;

public class CheckingStringEqualityWithoutCase {

    public static void main(String[] args) {

        String userName = "aBc123" ;

        boolean userNameCorrect = userName.contains("ABC123") ;

        System.out.println(userNameCorrect);

        boolean nameCheckIgnoreCase = userName.equalsIgnoreCase("ABC123") ;

        System.out.println(nameCheckIgnoreCase);



        // story your name is a name variable
        // check for equality using different uppercase lowercase example
        // using equals and equalsIgnoreCase

        String name = "Gunel";
        //I want to store result of checking name into a variable

         boolean nameEqualsWithoutCase = name.equalsIgnoreCase("Gunel");
        System.out.println("does this name has same character caring about case");
        System.out.println(nameEqualsWithoutCase);

        System.out.println(name.equalsIgnoreCase("gunel"));

    }




}
