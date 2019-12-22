package sevenfolder;

public class Casting {

    public static void main(String[] args) {

        //int num = 10 ;

        // implicitly(automatically) convert to double 10.0
        // and stored inside bigNum behind scene
        double bigNum = 10 ;
        System.out.println(bigNum);

        // 12.99 is double , double has much bigger range then int
        // so it just does not fit
       // int num = 12.99 ;  // compiler error !!!!

        int num = (int) 12.99 ;
        System.out.println(num);






        // create a long variable and store int
        long earthToMoon =  100000 ;  // ---->> 10000L
        // create an int variable and try store above long value
        int earthToMoonIn_int =(int) earthToMoon;
        System.out.println(earthToMoonIn_int);



    }

}
