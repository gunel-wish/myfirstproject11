package day17;

public class ReversePrintString {
    public static void main(String[] args) {

        // get your name printed in reversed order
        // assuming you don''t know the length your name

        // find out the location of your last character of your name
        // pick your last character of your name according to the location
        // then keep shifting the location  picking until first character
//                     01234567     index = count -1
        String name = "Birnigar" ;
//                     12345678       count = name.length()
        int x = name.length() -1  ;

        while ( x >=0) {
            System.out.println("index " + x + " : " + name.charAt(x )   );
            --x ;


        }




    }

}
