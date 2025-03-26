package util;

//Factorial of a number n, denoted as n!, is the product of all positive integers from 1 to n.
//n!=n×(n−1)×(n−2)×...×1
public class FactorialOperations {
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        return (n == 0 || n == 1) ? 1 : n * calculateFactorial(n - 1);
    }
}
