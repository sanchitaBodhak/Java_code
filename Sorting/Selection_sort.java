package Sorting;
import java.util.Scanner;
public class Selection_sort {
    public static void print_array(int[] arr){
    for (int i=0 ; i< arr.length; i++){
        System.out.print(arr[i] + "\t");
    }
}
    public static int[] input_array(int size){int[] array = new int[size];
    System.out.println("take input one by one");
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
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("give the size of the array...");
        int n = sc.nextInt();
        int[] arr = input_array(n);
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    mindx = j ;
                }
            }
            //now swap arr[i] & mindx
            swap(arr,i,mindx);
        }
        System.out.println("Sorted array is ....");
        print_array(arr);
    }
}
