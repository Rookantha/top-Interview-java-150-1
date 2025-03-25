package util;

public class RemoveElement {
    // Method to remove all occurrences of val in nums and return the new length
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the position of the next non-val element.

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place the non-val element at position k.
                k++; // Move the pointer for the next non-val element.
            }
        }

        return k; // Return the count of elements that are not equal to val.
    }
}
