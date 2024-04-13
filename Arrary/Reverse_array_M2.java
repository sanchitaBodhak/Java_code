package Arrary;
import java.util.Scanner;
public class Reverse_array_M2 {
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
        int low = 0;
        int high = n-1;
        int temp;
        while(low<high){
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        System.out.println(" reversed array = ...");
        print_array(arr);
    }
}
