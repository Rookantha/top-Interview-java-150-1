package util;

public class EvenOddOperations {
    public static void printEvenNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printOddNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
