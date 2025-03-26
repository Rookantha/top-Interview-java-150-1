package util;

public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // If the array is empty or null, return 0
        }

        int uniqueIndex = 1; // Pointer for placing the next unique element

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex - 1]) { // If a new unique element is found
                nums[uniqueIndex] = nums[i]; // Place it at the correct position
                uniqueIndex++; // Move the pointer for the next unique element
            }
        }

        return uniqueIndex; // Number of unique elements
    }
}
