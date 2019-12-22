package day18;

public class EvenNumber_ForLoop {
    public static void main(String[] args) {

     // skip counting by 2
     //starting from 0--10

        for( int i=0; i <100 ; i+=2) {

            System.out.print(i + " ");  // or i = i +2

        }



    for( int x= 0; x<100;  x+=3 ) {
        System.out.print(x+ " ");

    }
     // skip counting by 3
     // starting from 0--100
        System.out.println("-----------");

        for (int i = 0; i < 100; i++) {
            if ( i % 2 == 0) {
                System.out.print( i + " ");
            }
        }
        System.out.println("---------");
        // the short cut for generating for loop is: fori enter or tab
        for (int i = 0; i < 100; i++) {

            if ( i% 5==0    &&  i%3==0   ) {
                System.out.print(i+ " is fizz buzz number");
            }
        }

        // everything you can do with the for loop--->> can be done using while loop !!!
    }
}
