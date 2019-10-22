import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int limit = Integer.parseInt(reader.nextLine());
        int i = 1;
        int fact = 1;
        while (i <= limit) {
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
    
}
