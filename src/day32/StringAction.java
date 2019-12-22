package day32;

public class StringAction {

    public static void main(String[] args) {

      //  reversePrintMyOwnName();
     //   String name = "Akbar" ;
printStringWithDashInBetween("Lisa ");
printStringWithDashInBetween("gulbahar ");

    }

public static void printStringWithDashInBetween(String name){

    for (int i = 0; i <name.length() ; i++) {
        System.out.print(name.charAt(i));
        //if i am not last index then i print
        if(i !=name.length()-1){
            System.out.print("-");
        }
    }
    System.out.println();
}





    /*
    *create
     */


    public static void reversePrintMyOwnName(){
//                     01234
        String name = "Akbar" ;
 //   star from last character
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));
        }

        System.out.println();
    }


}
