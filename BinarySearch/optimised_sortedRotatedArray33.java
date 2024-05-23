package BinarySearch;

import java.util.Scanner;

public class optimised_sortedRotatedArray33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {30, 40, 50, 60, 70, 0, 10, 20};
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        boolean flag = false;
        System.out.println(" choose one element from the array");
        int t = sc.nextInt();
        while(low <= high){
            int mid = low + (high-low)/2;
            if (t == arr[mid]){
                flag = true;
                System.out.println("element found at index ..."+mid);
                break;
            } else if (arr[mid] < arr[high]) { // cursor inside right sorted array
                if (t > arr[mid] && t <= arr[high]){
                    low = mid + 1;
                }else {
                    high = mid-1 ;
                }
            }else { // cursor inside left sorted array
                if (t >= arr[low] && t < arr[mid]){
                    low = mid + 1;
                }else {
                    high = mid-1 ;
                }
            }
        }
        if(flag == false){
            System.out.println("element does not found");
        }
    }
}
