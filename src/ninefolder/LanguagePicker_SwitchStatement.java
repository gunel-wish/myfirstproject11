package ninefolder;

public class LanguagePicker_SwitchStatement {

    public static void main(String[] args) {


        System.out.println(" Welcome to Cybertek call center");
        System.out.println(" please select your language option from 1-7  ");

        int languageOption = 4;
        String greeting = "";

        switch (languageOption) {

            case 1:
                greeting = " Hello";
                break;
            case 2:
                greeting = " Privet";
                break;
            case 3:
                greeting = " Szia";
                break;
            case 4:
                greeting = " Merhaba";
                break;
            case 5:
                greeting = " Hola";
                break;
            case 6:
                greeting = " Salam";
                break;
            case 7:
                greeting = " Bonjur";
                break;
            default:
                greeting = " unknown";


        }

        greeting = greeting + ", SDET" ;
        System.out.println(  " This is how the greeting massage you get " + greeting);


    }


}
