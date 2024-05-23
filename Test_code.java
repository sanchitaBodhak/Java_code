public class Test_code {
    public static boolean isPossible(int cap, int[] arr, int day){
        int n = arr.length;
        int load = 0 ;
        int d = 1;
        for (int i = 0; i < n; i++) {
            if (load + arr[i] <= cap){
                load += arr[i];
            }else{
                load = arr[i];
                d++;
            }
        }
        if (d <= day){
            return true;
        }else{
            return false;
        }
    }
    public static int capacity(int[] arr,int day){
        int max = Integer.MIN_VALUE;
        int sum = 0 ;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i] , max);
            sum += arr[i];
        }
        int low = max;
        int high = sum;
        int ans = 0 ;
        while (low <= high){
            int mid = low +(high - low)/2;
            if (isPossible(mid,arr,day)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}