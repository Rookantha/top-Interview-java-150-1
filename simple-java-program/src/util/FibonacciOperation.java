package util;

public class FibonacciOperation {
    public static void printFibonacci(int n) {
        System.out.print("Fibonacci series: ");
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

}
