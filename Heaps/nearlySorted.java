package Heaps;

import java.util.PriorityQueue;

public class nearlySorted {
    public static void main(String[] args) {
        int[] arr = {6,5,3,2,8,10,9};
        int k = 3;
        int[] ans = new int[arr.length];
        int i = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : arr){
            pq.add(ele);
            if (pq.size()>k) {
                ans[i] = pq.remove();
                i++;
            }
        }
        while (pq.size() >0){
            ans[i] = pq.remove();
            i++;
        }
        System.out.println("sorted array.." );
        for (int j = 0; j < ans.length; j++) {
            System.out.print(ans[j]+"\t");
        }
    }
}
