package BinarySearch;

import java.util.Scanner;

public class binarySearch_1 {
    public static int[] input_array(int size){
        int[] array = new int[size];
        System.out.println("take input one by one in sorted order");
        Scanner sc = new Scanner(System.in);
        for ( int i = 0; i < size ; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(" your given array is..");
        for ( int i = 0; i < size ; i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        return array;
    }
    public static void print_array(int[] arr){
        for (int i=0 ; i< arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        System.out.println(" enter size of your array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = input_array(n);  // taking the array as user input
        System.out.println(" enter your target element");
        int target = sc.nextInt();
        int low = 0;       // pointer which points the lowest index in considered array
        int high = n-1 ;   // pointer which points the higher index in considered array
        boolean flag = false;// false means absent in the array
        int mid = -1 ;
        while(low < high){
             mid =  low + (high - low)/2 ; // this is just low+high /2 , written this way to avoid integer overflow
            if ( target == arr[mid]){
                flag = true;    // true means target is present in array
                break;
            } else if (arr[mid] < target) {
                low = mid + 1 ;
            } else if ( arr[mid] > target) {// it can be done by else only,
                high = mid - 1 ;            // else if used// to show similiarity
            }
        }
        if (flag == true){
            System.out.println(" the target element "+ target + " is found ");
        }else
        {
            System.out.println("element not found");
        }
    }
}
