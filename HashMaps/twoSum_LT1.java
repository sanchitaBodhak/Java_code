package HashMaps;

import java.util.HashMap;

public class twoSum_LT1 {
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the array values and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        // Initialize an array to store the indices of the two numbers that add up to the target
        int[] ans = new int[2];

        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the remainder needed to reach the target
            int rem = target - nums[i];

            // Check if the remainder is already in the map
            if (map.containsKey(rem)) {
                // If found, store the current index and the index of the remainder in the answer array
                ans[0] = i;
                ans[1] = map.get(rem);
                break; // Exit the loop as we found a solution
            } else {
                // If not found, add the current number and its index to the map
                map.put(nums[i], i);
            }
        }
        // Return the indices of the two numbers that add up to the target
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {1,6,8,9,4,5};
        int[] ar = twoSum(arr,9);
        System.out.println(ar[0]);
        System.out.println(ar[1]);
    }
}
