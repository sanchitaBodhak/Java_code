package Advance_Sorting;

public class quick_sort {
    public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + "\t");
    }
    System.out.println();
}
    public static int partition(int[] arr, int lo,int hi){
        int pivot = arr[lo];
        int pivot_idx = lo;
        int smallerCount = 0;
        for (int i = lo+1 ; i <= hi ; i++) {
            if (arr[i] <= pivot){
                smallerCount++;
            }
        }
        int correctIdx = pivot_idx + smallerCount;
        // now swap arr[pivot_idx] & arr[ correctIdx]
        int temp = arr[pivot_idx];
        arr[pivot_idx] = arr[correctIdx];
        arr[correctIdx] = temp ;
        // partition
        int i = lo,j = hi;
        while ( i<correctIdx && j>correctIdx){
            if (arr[i] <= pivot){
                i++;
            } else if (arr[j] > pivot) {
                j--;
            } else if (arr[i]>pivot && arr[j] <= pivot) {
                // swap
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return correctIdx;
    }
    public static void quicksort(int[] arr, int lo,int hi){
       if(lo >= hi) return;
        // pivot arr[lo] k thik jaygay rakho
        //left part  <= pivot
         int idx = partition(arr,lo,hi);
         quicksort(arr,lo,idx-1);
         quicksort(arr,idx+1,hi);

    }

    public static void main(String[] args) {
        int[] arr = {12,13,9,58,63,42,60};
        print(arr);
        quicksort(arr,0, arr.length-1);
        print(arr);
    }
}
