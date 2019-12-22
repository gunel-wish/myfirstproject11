package thirteenthfolder;

public class WarmUP_AmozonShippingCalculator {

    public static void main(String[] args) {

        /**
         * Amazon has 2 types of user one is Prime member and another is regular member
         * prime member get free shipping in all purchase no matter the amout
         * regular member user get free shipping only if their purchase is more than 25$
         * otherwise they get 5$ shipping fee
         *
         */

        String memberType = "PRIME MEMBER";
        double amount = 15.99d;
        int shippingFee = 0;

        // first i wanna check it's prime member or not
        if (memberType.equalsIgnoreCase("PRIME MEMBER")) {
            System.out.println(" YOUR GET 1 DAY FREE SHIPPING");
            System.out.println("your final price is" + amount);
            }else if ( amount > 25 ){
       // } else if (!memberType.equalsIgnoreCase(" PRIME MEMBER") && amount > 25) {

            System.out.println(" NOT A PRIME NUMBER BUT YOU ORDER IS MORE THAN 25");
            System.out.println(" YOU GOT FREE SHIPPING" + amount);


        } else {
            System.out.println(" DO YOU WANNA  SIGN UP FOR PRIME MEMBERSHIP");
            shippingFee = 5;
            amount = amount + shippingFee;  // amount += shippingFee
            System.out.println(" YOUR FINAL AMOUNT IS " + amount);

        }


    }


}
