package fourteenthfolder.day14;

public class LastIndexOf {

    public static void main(String[] args) {

        //           012345678901
        String name = "Game of Java" ;  // length is 12 , last char index is 11

       // find out last location the letter a show up
        System.out.println("find out last location the letter a show up");
        System.out.println( name.lastIndexOf("a")  );

        // find out last location the chacter space shows up
        System.out.println("find out last location the chacter space shows up");
        System.out.println(name.lastIndexOf(" ")  );
        // find out last location the letter Ga shows up
        System.out.println("find out last location the letter Ga shows up");
        System.out.println(name.lastIndexOf("Ga")  );
        // find out last location the letter Kawa shows up
        System.out.println( " find out last location the letter Kawa shows up");
        System.out.println(name.lastIndexOf("Kawa")  );

        // if i don't use contains method , what woud be my condition to check
        // whether we have Kawa in this String , either using indexof or lastindexof

        if ( name.indexOf("Kawa") >-1 ) {
            System.out.println("Kawa found!!!");
        }else {
            System.out.println(" No Kawa - No pumpkin");
        }



    }

}
