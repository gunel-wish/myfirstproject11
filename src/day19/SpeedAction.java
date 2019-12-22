package day19;

public class SpeedAction {
    public static void main(String[] args) {

     //   Create 2 int variable called start , end


     //   Assuming start > end is always less than end speed
    //    Create a for loop to stimulations slow increase of the speed,
     //   For example if start 10  , end 27
     //   Print—>> 10 ,11 , 12 .,13……27

        //this is how we counted from 1 to 10

       // for (int i = 0; i <= 10; i++) {

      //         System.out.print(i + " ");

      //  }

         int start = 5 ;
         int end =  19 ;



        System.out.print("you have started at speed--->>  ");
        for (int i = start; i <=end ; i++) {

            System.out.print(i + " ");

        }


    }
}
