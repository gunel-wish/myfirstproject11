package thirteenthfolder;

public class MoreStringPractice {

    public static void main(String[] args) {

        String name =" Pampkin" ;
        System.out.println(name);

      //  name = "Cat ";
      //  System.out.println(name);
        // String is immutable , once created it can not be changed
        // any String actions/ methods that looks like changing the value
        // actually creating a new String object

        name.toUpperCase() ;
        System.out.println(name);

        System.out.println(name.toUpperCase());

        // what if i really want to change the name


       name = name.toUpperCase() ;
        System.out.println( name  );


    }





}
