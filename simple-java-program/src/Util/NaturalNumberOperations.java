package Util;

public class NaturalNumberOperations {
    public static int calculateSum(int n) {
        if (n < 0) {
            System.out.println("Invalid number");
            return 0;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
