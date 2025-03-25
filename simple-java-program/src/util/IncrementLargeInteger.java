package util;

public class IncrementLargeInteger {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate from the last digit to the first digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Increment the current digit
                return digits; // Return the result as no further carry is needed
            }
            // If the digit is 9, set it to 0 and continue
            digits[i] = 0;
        }

        // If we reach this point, all digits were 9, and we need an additional digit
        int[] result = new int[n + 1];
        result[0] = 1; // Set the first digit to 1, remaining are 0 by default
        return result;
    }
}
