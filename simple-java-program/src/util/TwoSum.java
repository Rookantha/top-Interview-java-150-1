package util;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num; // Find the complement

            // If the complement is already in the map, return the indices
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }

            // Otherwise, add the current number and its index to the map
            map.put(num, i);
        }

        // Return an empty array in case there's no solution (though it won't be needed as per the problem statement)
        return new int[]{};
    }
}
