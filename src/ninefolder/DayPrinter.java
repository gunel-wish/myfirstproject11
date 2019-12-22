package ninefolder;

public class DayPrinter {

    public static void main(String[] args) {

        /*
        cerate a variable called dayCode as int
        *if the day code is 1 ---->> Monday
        * if the day code is 2 ---->> Tuesday
         * if the day code is 3 --->> Wednesday
         * if the day code is 4 ---->>Thursday
         * if the day code is 5 ---->> Friday
         * if the day code is 6 ---->> Saturday
         * if the day code is 7----->> Sunday
         * if none of the above just print unknown day
         *
         */
        int dayCode = 4;

        if (dayCode == 1) {
            System.out.println(" day is Monday ");
        } else if (dayCode == 2) {
            System.out.println(" day is Tuesday");
        } else if (dayCode == 3) {
            System.out.println(" day is Wednesday ");
        } else if (dayCode == 4) {
            System.out.println(" day is Thursday");
        } else if (dayCode == 5) {
            System.out.println("day is Friday");
        } else if (dayCode == 6) {
            System.out.println(" day is Saturday");
        } else if (dayCode == 7) {
            System.out.println(" day is Sunday");
        } else {
            System.out.println(" unknown");
        }


    }


}
