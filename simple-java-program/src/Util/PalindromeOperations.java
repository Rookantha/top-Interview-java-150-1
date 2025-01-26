package Util;

public class PalindromeOperations {
    public static boolean isPalindrome(int n) {
        String original = Integer.toString(n);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    public static boolean isStringPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
