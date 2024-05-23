package BinarySearch;

import java.util.Scanner;

public class firstAndLast_Ocurrence {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 20, 20, 20, 20, 20, 30, 30, 40, 40, 50, 50, 50, 50};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int mid = -1;
        int low, high;
        // first position
        int fp = -1;
        low = 0;
        high = n - 1;
        while (low <= high) {
             mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                if (mid > 0 && arr[mid] == arr[mid - 1]) {
                    high = mid - 1;
                } else {
                    fp = mid;
                    break;
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        //last position
        int lp = -1;
        low = 0;
        high = n - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                if (mid < n - 1 && arr[mid] == arr[mid + 1]) {
                    low = mid + 1;
                } else {
                    lp = mid;
                    break;
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("first position is..." + fp + "last position is ..." + lp);
    }
}
