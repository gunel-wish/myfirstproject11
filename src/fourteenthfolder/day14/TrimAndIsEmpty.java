package fourteenthfolder.day14;

public class TrimAndIsEmpty {

    public static void main(String[] args) {

      String massage = "    REPL IS COMING ! "   ;
        System.out.println(massage);
        System.out.println("massage character count is " + massage.length() );
        // trim method is used to take out spaces on two sides
        // not in between !!!

        massage = massage.trim();
        System.out.println(massage);
       // System.out.println(     massage.trim()  );

        System.out.println("massage character count is " + massage.length() );

        System.out.println( massage.isEmpty()   );


    }




}
