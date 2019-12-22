package elevenfolder;

public class StringEquality {

    public static void main(String[] args) {


        String name = "Rabia" ;  // String literak

        String name2 = new String ( "Rabia") ;
        String name3 ="Rabia" ;

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(" USING == METHODS");
        System.out.println(  name == name2        );
        System.out.println(   name == name3       );

      //  the correct way of comparing String to get consistent result is
        // using one of the String object behaviour / method called
        // equals method
        // strl.equals(str2)
        System.out.println(" USING EQUALS METHOD");
        System.out.println(name.equals( name2)    );
        System.out.println( name.equals(name3)     );

        // bottom line is : do not ever use == to check string equality

    }


}
