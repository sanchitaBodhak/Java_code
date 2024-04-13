package Arrary;
import java.util.Scanner;
public class Sort_binary_array {
    public static void main(String[] args) {
        System.out.println("tell us the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = input_array(n);
        int low = 0;
        int high = n-1;
        while (low<high) {
            if (arr[low] == 0) {
                low++;
            }
            if (arr[high] == 1) {
                high--;
            }
            if (low > high) {
                break;
            }if (arr[low] > arr[high]) {
                int temp = arr[high];
                arr[high] = arr[low];
                arr[low] = temp;
            }
        }
        System.out.println("sorted array = ..");
        print_array(arr);
    }
    public static int[] input_array(int size){
        int[] array = new int[size];
        System.out.println("take input one by one in 0s and 1s");
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
