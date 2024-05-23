package BinarySearch;
import java.util.Scanner;
public class FindKthMissingNO_Leetcode1539 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int low = 0 ;
        int high = arr.length-1;
        int missed = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("tell what missing no. you want ");
        int k = sc.nextInt();
        while (low <= high){
            int mid = low + (high - low) /2;
            missed = arr[mid] - (mid +1); // formula for missed no. till i = arr[i]-(i+1).
            if (missed < k){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
 // after loop terminated..low = high+1;& kth missing no resides in btw arr[high] & arr[low}
        int ans = k +low;
        System.out.println("the kth missing no is...."+ ans);
    }
}
