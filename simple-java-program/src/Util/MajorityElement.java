package Util;

public class MajorityElement {
    // Static method to find the majority element
    public static int majorityElement(int[] nums) {
        int candidate = nums[0]; // Initial candidate.
        int count = 0; // Counter for the candidate.

        for (int num : nums) {
            if (count == 0) { // If count is 0, select a new candidate.
                candidate = num;
            }
            if (num == candidate) {
                count++; // Increment count if the number matches the candidate.
            } else {
                count--; // Decrement count otherwise.
            }
        }

        return candidate; // The majority element.
    }
}
