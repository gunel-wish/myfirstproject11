package ninefolder;

public class CitizenTypeChecker {

    public static void main(String[] args) {
   /*
    * //Task 2
        Create a class called citizenTypechecker with main method
        Create a variable called citizenType as String
        And create a variable with age
        If age is more 65 ,assign value of citizenType to senior
        If not, assign value of citizenType to Not-Senior

        Eventually print out (the citizen age is < number> , he is < senior>
    **/
      String citizenType ;


    int age = 70 ;

     if ( age > 65) {
         citizenType = "senior" ;
     }else {
         citizenType = " not senior" ;
     }
        System.out.println( " the citizen age is " + age + " , and he is a " + citizenType) ;

       //what can you do inside each part of if  statement inside curly braces
    }


}
