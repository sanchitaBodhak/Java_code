package Sorting;

import java.util.Scanner;

public class cheakIfAraayIsSorted {
    public static void main(String[] args) {
        System.out.println("give the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        int[] arr = input_array(n);
        for (int i = 0 ; i < n-1; i++){
            if (arr[i]>arr[i+1]){
                flag = false;
            }
        }
        if (flag == true){
            System.out.println("the array is sorted");
        }else {
            System.out.println(" the array is unsorted");
        }
    }
    public static int[] input_array(int size){
        int[] array = new int[size];
        System.out.println("take input one by one ");
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
}
