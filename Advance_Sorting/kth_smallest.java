package Advance_Sorting;

import java.util.Scanner;

public class kth_smallest {
    public static void partition(int[] arr, int lo,int hi,int k) {
            int pivot = arr[lo];
            int pivot_idx = lo;
            int smallerCount = 0;
            for (int i = lo + 1; i <= hi; i++) {
                if (arr[i] <= pivot) {
                    smallerCount++;
                }
            }
            int correctIdx = pivot_idx + smallerCount; int temp = arr[pivot_idx];
            arr[pivot_idx] = arr[correctIdx];
            arr[correctIdx] = temp ;
            // partition
            int i = lo,j = hi;
            while ( i<correctIdx && j>correctIdx){
                if (arr[i] <= pivot){
                    i++;
                } else if (arr[j] > pivot) {
                    j--;
                } else if (arr[i]>pivot && arr[j] <= pivot) {
                    // swap
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if (correctIdx == k-1){
                System.out.println(" the "+k+"th smallest  element is :" + arr[correctIdx]);
            } else if (correctIdx > k-1) {
                partition(arr,0,correctIdx-1,k);

            }else {
                partition(arr,correctIdx+1,hi,k);
            }

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = {10,20,25,56,59,42,21};
            System.out.println(" choose k");
            int k = sc.nextInt();
            partition(arr,0, arr.length-1,k );
        }
}
