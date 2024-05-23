package BinarySearch;
import java.util.Scanner;
public class lowerBound {
    public static int[] input_array(int size){
        int[] array = new int[size];
        System.out.println("take input one by one in sorted order");
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
        System.out.println(" enter size of your array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = input_array(n);  // taking the array as user input
        System.out.println(" enter your target element");
        int target = sc.nextInt();
        int low = 0 ;       // pointer which points the lowest index in considered array
        int high = n-1 ;   // pointer which points the higher index in considered array
        int mid ;
        int lower_bound = n;
        while(low < high){
           mid =  low + (high - low)/2 ;
           if (arr[mid] >= target ){  // remove the = to make upperbound
                lower_bound = Math.min(lower_bound,mid);
                high = mid - 1;
           } else {
               low = mid + 1;
           }
        }
        System.out.println(" the lower bound of the element "+target+" is ..." +lower_bound);
    }
}
