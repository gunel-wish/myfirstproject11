package ninefolder;

public class DayPrinter_With_SwitchStatement {

    public static void main(String[] args) {

        int dayCode = 5 ;
        // 1 is the actual value you are checking
        // just like dayCode ==1

        switch ( dayCode) {
            case 1 :
                System.out.println(" day is Monday");
                break; // used to get out of this branch
            case 2 :
                System.out.println( " day is Tuesday");
                break;
            case 3 :
                System.out.println(" day is Wednesday ");
                break;
            case 4 :
                System.out.println(" day is Thursday");
                break;
            case 5 :
                System.out.println(" day is Friday");
                break;
            case 6 :
                System.out.println("day is Saturday" );
                break;
            case 7 :
                System.out.println("day is Sunday");
                break;
            default:
                System.out.println(" day is unknown");










        }


    }


}
