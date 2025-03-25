package util;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // If the array is empty, return 0
        }

        int k = 1; // Pointer for the next unique element position

        // Start from the second element and compare with the last unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) { // If current element is not equal to the last unique element
                nums[k] = nums[i]; // Place it at the correct position
                k++; // Move the pointer
            }
        }

        return k; // k is the number of unique elements
    }
}
