package day31;

public class DailyRoutine {

    public static void wakeUp(){

        System.out.println("open your eye , only one ");
        System.out.println("close your eyes");
        System.out.println("hear your alaram ,  open it again");
        System.out.println("------------");
    }



        public  static void drinkCoffee() {
            System.out.println("Put coffee in your coffee machine");
            System.out.println("press the button make your coffee");
            System.out.println("------------");
        }




        public static void prepareKidsForSchool(){

            System.out.println("kiss your kids to wake them up");
            System.out.println("wake them up for 10 times");
            System.out.println("prepare  their breakfast and lunch");
            System.out.println("eat with them");
            System.out.println("------------");
        }






    public static void TakeThemToSchool(){
        System.out.println("take them to school bus");
        System.out.println("say good bye");
        System.out.println("------------");

    }
    public static void studyJava() {

        System.out.println("thing about Java waking up");
        System.out.println("thing about Java drinking coffee");
        System.out.println("thing about Java prepering kids for school");
        System.out.println("review last class , come ready for the class");
        System.out.println("------------");
    }

    public static void sayILoveJava300Times(){

        for (int i = 1; i <=300; i++) {
            System.out.println("i love Java | ");

        }

        System.out.println();
    }

    public static void main(String[] args) {

        wakeUp();
        drinkCoffee();
        prepareKidsForSchool();
        TakeThemToSchool();
        studyJava();
        sayILoveJava300Times();
        /*
        *wakeUp
        * drinkCoffee
        * prepareKidsForSchool
        * TakeThemToSchool
        * goToWork
        * groceryShopping
        * cooking
        * studyJava
        * goTosleep
        *
        *
         */

    }


}
