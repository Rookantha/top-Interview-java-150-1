package util;

public class PalindromeString {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch found
            }
            left++;
            right--; // Move pointers inward
        }
        return true; // No mismatches, it's a palindrome
    }
}
