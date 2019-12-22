package twelewfolder;

public class CarShopping {
    public static void main(String[] args) {

     // buy corolla or Tesla ( only if it's within the budget )

     // there is only one car covered with cloth
        // we don't know what car is it and what is the price
        //once we take out the cloth
        // we check whether it's toyota , if it's we buy it without checking the price
        // if it's not we check if it's a Tesla and also check whether if it is within the budget

     String carBrand = "Corolla" ;
     int carPrice  = 60000 ;
     int budget  = 60000 ;

   //   if(  carBrand.equals("corolla")  ||  (carBrand.equals("Tesla")   &&  carPrice<= budget )   )  {
   //       System.out.println(" CAR ACQUIRED !!");
  //    }else {
 //         System.out.println("NOT WHAT I AM LOOKING FOR");
 //     }

        if (carBrand.equals("Corolla")) {

            System.out.println(" Corolla CAR ACQURED !!!");
        } else if ( carBrand.equals("Tesla")   && carPrice<= budget) {
            System.out.println(" Tesla CAR ACQURED !!!");
        }else {
            System.out.println(" NOT WHAT I AM LOOKING FOR");
        }







    }







}
