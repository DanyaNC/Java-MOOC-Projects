
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        System.out.print("Guess a number: ");
        int number = 0;
        while (true) {
            int guess = Integer.parseInt(reader.nextLine());
            number++;
            if (guess == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (guess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + number);
            } else {
                System.out.println("The number is lesser, guesses made: " + number);
            }
            
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
