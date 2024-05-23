package BinarySearch;
import java.util.Scanner;
public class sqrt_leetcode69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no.  ");
        int n = sc.nextInt();
        int low = 0;
        int high = n ;
        boolean flag = false;
        while(low <= high){
             int mid =  low + (high - low)/2 ; // this is just low+high /2 , written this way to avoid integer overflow
            if ( (mid*mid) == n){
                System.out.println("thr square root is ... "+mid);
                flag = true ;
                break;
            } else if ((mid*mid) < n) {
                low = mid + 1 ;
            } else  {
                high = mid - 1 ;
            }
        }

        if (flag == false){
            System.out.println(" the number does not have a integer square root...the rounded down sqrt is.. "+ high);
        // the termination condition of loop is low = high + 1
            //for last element low = mid = high...so its rounded down integer would be..high = low-1
        }
    }
}
