package Arrary;

import java.util.Scanner;

public class Reverse_array_M1 {
    public static int[] input_array(int size){
        int[] array = new int[size];
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
    public static void print_array(int[] arr){
        for (int i=0 ; i< arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" tell us the size of the array");
        int n = sc.nextInt();
        int[] arr = input_array(n);
        int temp;
        for (int i = 0; i < n/2 ; i++) {
             temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        System.out.println(" reversed array is");
        print_array(arr);
    }
}
