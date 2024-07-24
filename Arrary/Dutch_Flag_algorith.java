package Arrary;
// given an array with 0's 1's and 2's ...... sort them
public class Dutch_Flag_algorith {

    public static void main(String[] args) {
        int[] arr = {0,1,1,0,2,0,2,2,1,0,1,0};
        int n = arr.length;
        int low,mid,high;
        low = 0;
        mid = 0;
        high = n-1;
        int temp;
        while( mid <= high){
            if (arr[mid] == 0){
                temp = arr[low] ;
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }else if (arr[mid] == 1) {
                mid++;
            }else{
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for (int i=0 ; i< arr.length; i++){
            System.out.print(arr[i] + "\t");
        }

    }
}
