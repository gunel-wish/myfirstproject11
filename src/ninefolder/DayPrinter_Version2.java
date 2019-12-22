package ninefolder;

public class DayPrinter_Version2 {
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
        int dayCode = 6;
        String dayName ;
        // String dayName = " " ; // assigning a empty  string value

        if (dayCode == 1) {
            dayName= " Monday" ;
        } else if (dayCode == 2) {
           dayName  = " Tuesday" ;
        } else if (dayCode == 3) {
            dayName = " Wednesday" ;
        } else if (dayCode == 4) {
           dayName = "Thursday" ;
        } else if (dayCode == 5) {
           dayName = "Friday " ;
        } else if (dayCode == 6) {
           dayName = " Saturday" ;
            System.out.println(" yay saturday");
        } else if (dayCode == 7) {
           dayName = " Sunday" ;
        } else {
            dayName = " unknown" ;
        }

        System.out.println( " day is " + dayName);

    }

}




