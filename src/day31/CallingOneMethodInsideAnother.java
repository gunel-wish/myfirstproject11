package day31;

public class CallingOneMethodInsideAnother {

    public static void main(String[] args) {
        finalAwake();
    }
    public static void finalAwake(){
        wakeUp();
        drinkCoffee();
    }

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





}
