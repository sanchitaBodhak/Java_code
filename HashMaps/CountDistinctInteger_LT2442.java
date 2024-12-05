package HashMaps;

import java.util.HashSet;

public class CountDistinctInteger_LT2442 {
    public static int reverse(int org){
        int rev = 0;
        while (org != 0){
           rev = org % 10;
           org = org / 10 ;
        }
        return rev;
    }
    public  static int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {1,13,10,12,31};// ans = 6
        int x = countDistinctIntegers(arr);
        System.out.println(x);
    }
}
