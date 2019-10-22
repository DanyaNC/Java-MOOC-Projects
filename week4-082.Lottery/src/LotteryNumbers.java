
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random;
    private int number;
    private ArrayList<Integer> drawn;

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        this.drawn = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers.clear();
        // Write the number drawing here using the method containsNumber()
        while (this.numbers.size() < 7) {
            this.random = new Random();
            number = random.nextInt(39)+1;

            if (this.containsNumber(number)) {

            } else {
                this.numbers.add(number);
            }
        }
        

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers

        return this.numbers.contains(number);
    }
}
