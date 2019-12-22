package day20;

public class PalindromeTest {
    
    
    // if you reserve a String it does change it means
    // the String is Palindrome
    public static void main(String[] args) {
        
        // level  , kayak ,elle , madam , aziza
        
        String name = "Kayak" ;
        System.out.println("name = " + name);

        String reversedName = "" ;

        for (int x = name.length()-1 ; x >=0 ; x--) {
            reversedName = reversedName + name.charAt(x) ;
            
        }
        System.out.println("reversedName = " + reversedName);

        // make this code does not about case spaces while character

        // check whether reversed name is equal without case checking
        if (name.equalsIgnoreCase(reversedName)) {
            System.out.println("Palindrome test has passed" );
        }else {
            System.out.println("Palindrome test has failed");
        }
        
        
        
        
    }



}
