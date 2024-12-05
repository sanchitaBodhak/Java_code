package PrefixSum;
import java.util.Arrays;
class NumArray {
    int[] arr;
    public NumArray(int[] nums) {
        arr = Arrays.copyOf(nums,nums.length);
        for (int i = 1; i < nums.length; i++) {
            arr[i] = arr[i-1] + arr[i];
        }


    }

    public int sumRange(int left, int right) {
        if(left == 0) return arr[right] ;
        return arr[right]-arr[left-1];
    }
}
public class rangeSumQuery_LT303 {
    public static void main(String[] args) {
        int[] ans = {1,2,3,4};
        NumArray num = new NumArray(ans);
        int n = num.sumRange(1,3);
        System.out.println(n);
    }
}
