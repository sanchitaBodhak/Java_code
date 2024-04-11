package Arrary;

import java.util.Scanner;

public class Max_second_max_two_pass {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = input_array(n);
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for (int i = 0 ; i < n ; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] > second_max && arr[i] != max){
                second_max = arr[i];
            }
        }
        System.out.println(" the maximum element is..."+max);
        if (second_max != Integer.MIN_VALUE)
            System.out.println("the second maximum element is...." +second_max);
        else
            System.out.println("the second maiximum element is..."+  max);
    }
}
