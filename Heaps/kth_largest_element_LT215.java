package Heaps;

import java.util.PriorityQueue;

public class kth_largest_element_LT215 {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length;i++){
            pq.add(nums[i]);
            if (pq.size()>k) pq.remove();
        }
        return pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = {10,26,54,3,86,94};
        int k = 2;
        int x = findKthLargest(arr,k);
        System.out.println(x);
    }
}
