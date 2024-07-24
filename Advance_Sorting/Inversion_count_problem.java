package Advance_Sorting;

public class Inversion_count_problem {
    static int count = 0;
    public static void print_array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
    public static void merge ( int[] a, int[] b, int[] c){
        int i=0, j=0, k=0;
        while (i<a.length && j< b.length){
            if (a[i] <= b[j]){
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while (j< b.length){
            c[k] = b[j];
            k++;
            j++;
        } while (i< a.length){
            c[k] = a[i];
            k++;
            i++;
        }
    }
    public static void inversion( int[] a, int[] b){
        int i = 0 , j = 0;
        while ( i < a.length && j < b.length ){
            if ( a[i] > b[j]){
                count += a.length - i ;
                j++;
            }
            else i++;
        }
    }
    public static void mergesort(int[] arr){
        int n = arr.length;
        if ( n== 1) return; // base case
        // now create two arrays of n/2 size each
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        // copy pasting data
        for (int i = 0;i<n/2 ; i++){
            a[i] = arr[i];
        }
        for (int i = 0; i < n-n/2; i++) {
            b[i] = arr[i+n/2];
        }
        // magic
        mergesort(a);
        mergesort(b);
        // the inversion done before merging
        inversion(a,b);
        // now merge these 'a' and 'b'
        merge(a,b,arr);
    }

    public static void main(String[] args) {
        count = 0 ;
        int[] arr = {109,33,89,27,60,10,70 };
        System.out.print(" the given array :");
        print_array(arr);
        mergesort(arr);
        System.out.print( "sorted array :  ");
        print_array(arr);
        System.out.println(" no of inversion count : " + count);
    }
}
