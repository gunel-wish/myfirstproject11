package sevenfolder;

public class IncrementAndDecrement {
    public static void main(String[] args) {

        /**
         * //——-the special case of increasing and decreasing numbers by 1
         * //——>> increment and decrement operator come in : ++—

         * ++— can only be used for one number variable
         * Int offer = 2 ;
         * Offer += 1 ; // 4 ++ will increase the number variable by
         */

         int apple = 10 ;
        System.out.println( " original apple is "+apple);
        // apple = apple + 1 ;
       //  apple += 1 ;
         ++ apple ; // this is increasing the value by one in shortcut using ++
        ++ apple ;
        System.out.println(" used ++ twice then apple is " + apple);

        // apple = apple - 1;
        // apple -= 1 ;
         -- apple ;
        System.out.println( " used -- once then apple is " +apple);

       // System.out.println(++apple);
        System.out.println("used ++ to increment and concatenate :" +                (++ apple) );












    }












}
