package BinarySearch;
    // bekar code
import java.util.Scanner;

public class sorted_rotated_array_leetcode33 {
    public static int binary_search(int[] arr, int hi, int lo, int target){
        while( lo <= hi){
            int m = lo + (hi - lo) / 2 ;
            if ( arr[m] == target){
                return m ;
            } else if (arr[m] < target) {
               lo = m +1 ;
            }else {
                hi = m - 1 ;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {30,40,50,60,70,0,10,20};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        System.out.println(" choose one element from the array");
        int t = sc.nextInt();

        //first binary search for pivot point
        int p = -1; // p denotes pivot point
        while(low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                p = mid;break;
            } else if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1]){
                p = mid - 1 ;break;
            } else if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
                low = mid+1 ;
            }else{
                high = mid-1 ;
            }
        }
        if (p == -1){  // array is not rotated
            int result = binary_search( arr, n-1,0,t);
            System.out.println("target is found at index" + result);
    }   else {
            int left = binary_search( arr , p,0,t);
            if(left == -1){
                int right = binary_search( arr,n-1,p+1,t);
                System.out.println("target is found at index..." + right);

            }else {
                System.out.println("target is found at index ......." +left);
            }

        }
}
}
