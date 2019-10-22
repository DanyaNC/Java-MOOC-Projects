
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = size;
        int c = 1;
        while (c <= size) {
            printWhitespaces(size - c);
            printStars(c);
            i--;
            c++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int spaces = height - 1;
        int number = 1;
        int i = 0;
        while (i < height) {
            printWhitespaces(spaces);
            printStars(number);
            i++;
            number += 2;
            spaces--;
        }
        i = 0;
        while (i < 2) {
            printWhitespaces(height - 2);
            printStars(3);
            i++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
