import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String palin = "";
        for (int i = text.length()-1; i >= 0; i--) {
            
            palin += text.charAt(i);
            
        }
        return palin.equals(text);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
