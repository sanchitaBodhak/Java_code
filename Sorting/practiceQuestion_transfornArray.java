package Sorting;
//Given an array with N distinct elements, convert the given array to a form where all
// elements are in the range from 0 to n-1 .the order of elements is the same,
// i.e. 0 is placed for the smallest element,1 is placed for the 2nd smallest element,
// .... n-1 is placed for the largest element.
public class practiceQuestion_transfornArray {
    public static void print_array(int[] arr){
        for (int i=0 ; i< arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
    public static void main(String[] args) {
        int[] arr = {40, 12, 7, 34, 100, 57, 23};
        print_array(arr);
        int n = arr.length;
        int x = 0 ;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1 ;
            for (int j = 0; j < n ; j++) {
                if (arr[j] < min && arr[j] > 0){
                    min = arr[j];
                    mindx = j;
                }
            }
            arr[mindx] = x;
            x--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = (-1)*arr[i];
        }
        System.out.println();
        print_array(arr);
    }
}
