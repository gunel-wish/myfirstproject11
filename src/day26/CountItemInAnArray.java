package day26;

import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {

    String [] marvelHeros = {"Iron Man" , "Captain America" , "Spider man" ,
            "Black Panther" , "Hulk" ,"Black Widow" , "Wanda" , "Captain Marvel"} ;

        System.out.println("Mervel Heros = " + Arrays.toString(marvelHeros));
        int sizeOfArray = marvelHeros.length ;
        System.out.println("Here count = " + sizeOfArray);


        String itemToSearch = "Black Widow" ;
        int countOfItem = 0;


        for( String eachHero : marvelHeros) {

            if( eachHero.equals(itemToSearch)){
                countOfItem ++ ;
            }
        }
        System.out.println("countOfItem" + countOfItem );

        // count the hero with the name contains black in case insensitive manner
        int cntOfBlackInName = 0 ;
        for (String eachHero : marvelHeros) {

            if ( eachHero.toLowerCase().contains("black")){
                cntOfBlackInName ++ ;



            }
        }

        System.out.println("cntOfBlackInName = " + cntOfBlackInName);



    }




}
