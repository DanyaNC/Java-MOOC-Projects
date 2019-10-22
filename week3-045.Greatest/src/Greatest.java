
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int test = Math.max(number1, number2);
        int max = Math.max(test, number3);
        return max;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
