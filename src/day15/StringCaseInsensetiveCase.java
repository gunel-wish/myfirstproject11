package day15;

public class StringCaseInsensetiveCase {
    public static void main(String[] args) {

        String name = " Arya Stark" ;

        System.out.println( "name contains st RESULAT IS : " + name.contains("st")  );

        // i wanna check wheter this name contains st no matter the case
        // so i want to store the uppercase version of this name then check for ST

        String upperCaseName = name.toUpperCase() ;   // "Arya stark"
        System.out.println(" upperCaseName contains ST or not ? " +upperCaseName.contains("ST")  );

        String lowerCasename = name.toLowerCase() ;  // "arya atark "
        System.out.println("lowerCaseName contains st or not ? " + lowerCasename.contains("st")   );
      // this is called method chaining , combining multiple method call
        // make my name lowecase (String) then check wheter it contains lowercase st
      //
        System.out.println(name.toLowerCase().contains("st") );
      //  System.out.println(name.length().toUpperCase() );




    }


}
