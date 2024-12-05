package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class kth_smallest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int k = sc.nextInt();
        // using min-heap........bad complexity
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr){
            pq.add(arr[ele]);
        }
        for (int i = 1; i < k; i++) {
            pq.remove();
        }
        System.out.println(" the kth smallest element is...."+pq.peek());

        // using max-heap.... mentoss method
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : arr){
            max.add(arr[ele]);
            if (max.size()>k) max.remove();
        }
        System.out.println(" the kth smallest element is...."+max.peek());
    }
}
