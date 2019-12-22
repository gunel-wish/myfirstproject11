package day17;

public class NamePrinter_WhileLoop {

    public static void main(String[] args) {


        // if you have complain in life : call 1-800-Alexander
        String name = "call 1-800-Alexander" ;

        // get each and evry character and print them out vertically

        int x = 0;
        // in order to print each cahracterof aString
        // we need  a start getting character
        // from index 0 till last index (name.length()-1  )

        while (x< name.length()  ) {  //      ( x<= name.length()-1 )

            System.out.print( "index "  + x  + " : ");
            System.out.println(name.charAt( x )   );
            ++ x;

        }

        // assuming you don''t know the length your name
        // write a program to print




    }

}
