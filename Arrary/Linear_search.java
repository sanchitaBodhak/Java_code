package Arrary;

import java.util.Scanner;

public class Linear_search {
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
        System.out.println("enter the element to find...");
        int ele = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele){
                System.out.println("element found at index "+i);
                flag = true;
                break;
            }
        }
        if (flag == false){
            System.out.println("element does not found");
        }
    }
}
