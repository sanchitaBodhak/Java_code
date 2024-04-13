// rotate array by k times without using an extra array
package Arrary;
import java.util.Scanner;
public class Rotate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" tell us the size of the array");
        int n = sc.nextInt();
        int[] arr = input_array(n);// calling input method to take inpt
        System.out.println("tell us how many times the array gonna rotate");
        int k = sc.nextInt();
        for (int i =1 ; i <= k; i++) { // this loop gonna run how many times the array rotates
            int first_element = arr[0];
            for (int j = 0; j <= n-2 ; j++) { //this loop actually rotates the array
                arr[j] = arr[j+1];
            }
            arr[n-1] = first_element;
        }
        System.out.println("your rotated array is...");
        print_array(arr);
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
    public static void print_array(int[] arr){
        for (int i=0 ; i< arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
