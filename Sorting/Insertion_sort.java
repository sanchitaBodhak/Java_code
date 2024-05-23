package Sorting;

import java.util.Scanner;

public class Insertion_sort {

    public static void print_array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int[] input_array(int size) {
        int[] array = new int[size];
        System.out.println("take input one by one");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(" your given array is..");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        return array;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the size of the array...");
        int n = sc.nextInt();
        int[] arr = input_array(n);
        for (int i = 1; i < n; i++) {  // n-1 passes
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j-1]){
                    swap(arr, j,j-1);  // swapping j & j-1
                }else {
                    break;
                }
            }
        }
        System.out.println("Sorted array is ....");
        print_array(arr);
    }
}
