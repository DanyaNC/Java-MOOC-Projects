
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String end = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            end += text.charAt(i);
        }
        return end;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
