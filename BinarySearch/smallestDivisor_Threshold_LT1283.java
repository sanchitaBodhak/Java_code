package BinarySearch;

public class smallestDivisor_Threshold_LT1283 {
    public static int minDivisor(int[] arr , int t){
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.max(arr[i],mx);
        }
        int divisor = 0;
        int lo = 1;
        int hi = mx;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            int sum = 0 ;
            for (int i = 0; i < n; i++) {
                if (arr[i] % mid == 0) {
                    sum += arr[i]/mid ;
                }else{
                    sum+= arr[i]/mid + 1 ;
                }
            }if (sum <= t){
                divisor = mid;
                hi = mid - 1;
            }else{
                lo = mid+1;
            }
        }
        return divisor;
    }

    public static void main(String[] args) {
        int[] arr ={5,5,9,2};
        int result = minDivisor(arr,4);
        System.out.println("the minimum divisor is..."+result);
    }
}
