package BinarySearch;
 // array must contain more than or equal to 3 elements
public class Peek_in_mountain_array_leetcode852 {
    public static void main(String[] args) {
        int[] arr = { 10,20,30,40,50,60,70,50,45,30};
        int n = arr.length;
        int low = 1; // first & last element must not be peak element
        int high = n-2 ; // then array would be normal sorted array
        int mid  = -1;
        while (low <= high){
            mid = low + (high - low)/2 ;
            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                break;
            } else if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
                low = mid + 1;
            }else {
                high = mid - 1 ;
            }
        }
        System.out.println("the peak element is...." +arr[mid] +" of index .." + mid);
    }
}
