package day22;

public class LoopingThrougthInverserevOrder {


    public static void main(String[] args) {

// creating an array object with empty space
        int [] scores = new int [4] ;
        // assigning value to each index
        scores[0] = 95;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        int elementCount = scores.length ;
        int lastItemIndex = elementCount - 1;

       // we printing in reverse order so
        // so we start with highest index till lowest index 0 --->>3-0



        for (int x =lastItemIndex; x >=0 ; x--) {
            System.out.println("index location " + x);
            System.out.println(scores[x]);
        }




    }


}
