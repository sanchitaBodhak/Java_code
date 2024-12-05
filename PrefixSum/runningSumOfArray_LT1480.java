package PrefixSum;

public class runningSumOfArray_LT1480 {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = runningSum(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+"\t");
        }
    }
}
