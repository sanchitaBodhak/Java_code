package HashMaps;

import java.util.HashMap;

public class countNicePairs_LT1814 {
    public static int reverse(int n){
        int rev = 0;
        while( n!= 0){
            rev = rev*10 + n%10;
            n = n/10;
        }
        return rev;
    }
    public static int countNicePairs(int[] nums) {
        int count = 0;
        HashMap<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i] - reverse(nums[i]);
                if (m.containsKey(x)) {
                    int freq = m.get(x);
                    count += freq;
                    count %= 1000000007;
                    m.put(x,freq+1);
                }
                else m.put(x,1);
            }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {42,11,1,97}; // op = 2
        int n = countNicePairs(arr);
        System.out.println(n);
    }
}
