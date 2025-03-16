package Util;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;

        // Step 1: Find potential majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
        /*

        Step 2: Verify the candidate (only needed if no guarantee)
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        return count > nums.length / 2 ? candidate : -1; // Return -1 if no majority found

         */
    }



}
