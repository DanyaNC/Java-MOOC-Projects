
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.print("Up to what number? ");
        int limit = Integer.parseInt(reader.nextLine());
        int number = 0;
        while (number < limit) {
            number++;
            System.out.println(number);
        }
    }
}
