package day21;

public class NameBreaker {
    public static void main(String[] args) {

       /*
Store your name into a variable name
Loop through each and every letters
 And print
If you see ,enter b —>> get out of the loop
        */
                    // 012345678
        String name = "Nursultan" ;

        // get out when you see letter l from the loop

        for (int x = 0; x < name.length();  x++){
            char currentChar = name.charAt(x);


            if( currentChar == 'l' ||   currentChar== 'l' ) {
                System.out.println("found it !!!");
                break;
            }
            System.out.println( currentChar);
        }


        for (int x = 0; x < name.length();  x++){
           String currentChar = name.substring(x, x+1);


            if( currentChar.equalsIgnoreCase("l")) {
                System.out.println("found it !!!");
                break;
            }
            System.out.println( currentChar);
        }




        // optionally chain the method without saving each char
        for (int x = 0; x < name.length();  x++) {


            if( name.substring(x, x +1).equalsIgnoreCase("l") ){
                System.out.println("found it !!");
                break;
            }


            System.out.println( name.substring(x , x+1));


        }


    }




}
