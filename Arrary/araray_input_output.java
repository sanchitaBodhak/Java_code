package Arrary;
import java.util.Scanner;
public class araray_input_output {
    public static void main(String[] args) {
        System.out.println("give the size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        input_array(n);
        int[] ar = {1,2,3,5};
        print_array(ar);

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
