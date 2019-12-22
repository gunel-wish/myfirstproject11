package sixfolder;

public class PreIncrementDecrementOperator {
    public static void main(String[] args) {


        // initializing ( giving value ) offerCount value to 2
        int offerCount = 2 ;
        // increasing the number by one using normal way ;
          offerCount = offerCount + 1 ;

        // this is incerasing the value by one using compound/shorthand operator
        offerCount += 1 ;

        // since increasing or decreasing a value is very special
        // and often used in programming
        // there is even shorter shortcut for this operation
        // and we use ++ or -- , THIS IS EXCLUSIVELY FOR INCREASING OR DECREASING BY 1
        // we can  not use it for any other time like increasing value by more than one


         ++ offerCount ;// this is same as offerCount += 1, offerCount= offerCount +, it's just shorter
        System.out.println(" offer now after increasing by one " + offerCount);

        -- offerCount;
        System.out.println( " offer now after decreasing by one" + offerCount);






    }






}
