package Util;

public class SquareRoot {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x; // Handle base cases

        int left = 1, right = x, result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate the mid-point

            // Check if mid*mid equals x or is the closest smaller value
            if (mid <= x / mid) {
                result = mid; // Store the current mid as the possible result
                left = mid + 1; // Move to the right half
            } else {
                right = mid - 1; // Move to the left half
            }
        }

        return result;
    }
}
