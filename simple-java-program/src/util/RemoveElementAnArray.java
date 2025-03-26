package util;

public class RemoveElementAnArray {
    // Method to remove all occurrences of val in nums and return the new length
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0; // Handle edge case: empty or null array
        }

        int validIndex = 0; // Pointer for placing non-val elements

        for (int num : nums) {
            if (num != val) {
                nums[validIndex] = num; // Place the non-val element at validIndex
                validIndex++; // Move the pointer forward
            }
        }

        return validIndex; // Return count of elements that are not val
    }
}
