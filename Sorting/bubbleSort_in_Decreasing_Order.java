package Sorting;

import java.util.Scanner;

public class bubbleSort_in_Decreasing_Order {

        public static void print_array(int[] arr){
            for (int i=0 ; i< arr.length; i++){
                System.out.print(arr[i] + "\t");
            }
        }
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
            System.out.println("give the size of the array");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] arr = input_array(n);
            //Bubble sort optimised
            for (int x = 0; x < n-1; x++) { // (n-1) --> it's the maximum number of passes that any array can be sort.

                for (int i = 0; i < n - 1 - x; i++) { // for each 'x' wala loop this loop will run one lesser. as largest element got its perfect position
                    if (arr[i]  < arr[i + 1]) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
            print_array(arr);
        }

}
