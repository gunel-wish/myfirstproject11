package day16;

public class IndexOfWith2Parametrs {
    public static void main(String[] args) {

        //  get the second java from the sentences
        // assume you already know there is 4 Java in this sentences
        // second java means --->> the java showed up after first Java


        // first find out where is location of the first Java showed up
        // in order to find second one
        // search from right after location you found first Java
        // then it will give you the index of second java

        // BUT HOW DO I START FROM DIFFERENT LOCATION WHEN USING INDEXOF
        // BECOUSE INDEX OF ALWAYS START FROM BEGINING

        // indexOf method has 2 version  1 expect 1 external data
        // another expext 2 external data -->> yourString

        //             012345678901234567890123456789012
        String name = "I Love Java I love Java Java Java" ;

        System.out.println( "Java starting from 0 " +  name.indexOf("Java")  );
        System.out.println(  "Java starting from 7 " +  name.indexOf("Java" , 7    )  );
        System.out.println(  "Java starting from 8 " + name.indexOf("Java" , 8    )  );
        System.out.println( "Java starting from 9 " +  name.indexOf("Java" , 9   )  );
        System.out.println(  "Java starting from 19 " + name.indexOf("Java" , 19    )  );
        System.out.println( "Java starting from 20 "  + name.indexOf("Java" , 20    )  );

        // how do i start from locationnthat get past first Java
        // basically starting point different that 0 so that it get past first Java
        int firstJavaLocation = name.indexOf( "Java") ; // location of first java in this case 7
        // starting point can be right after the index of first character of the word
        // or you can start here + 4
        // or you can start after you finish the word you are searching , for the word java + 4
        int startingPointToSearchSecondJava = firstJavaLocation + 1 ;
        int secondJavaLocation = name.indexOf("Java" , startingPointToSearchSecondJava) ;

        System.out.println("secondJavaLocation = " + secondJavaLocation);

        // i do not know how many word in this sentence . I only know there + 3 words
        // and there is only one space in between words
        // I just know to know what is second word
        // the word in between first space and second space word
        int firstSpaceLocation = name.indexOf(" ") ;
        int secondSpace = name.indexOf( " " , firstSpaceLocation +1);
        System.out.println( "second word in this sentence is"
                + name.substring(firstSpaceLocation + 1,secondSpace ));






    }



}
