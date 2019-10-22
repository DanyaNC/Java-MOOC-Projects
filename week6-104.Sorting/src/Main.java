
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallestsofar = array[0];
        for (int number : array) {
            if (smallestsofar > number) {
                smallestsofar = number;
            }
        }
        return smallestsofar;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int output = index;
        for (int i = index; i < array.length; i++) {
            if (array[output] > array[i]) {
                output = i;
            }
        }
        return output;
    }

    public static void swap(int[] array, int index1, int index2) {
        int placeholder = array[index1];
        array[index1] = array[index2];
        array[index2] = placeholder;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, (indexOfTheSmallestStartingFrom(array, i)), i);
        }
    }
}
