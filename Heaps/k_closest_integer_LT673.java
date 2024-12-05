package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class pair implements Comparable<pair>{
    int ele;
    int diff;
    pair(int ele,int diff){
        this.ele = ele;
        this.diff = diff;
    }
    public int compareTo(pair p){
        if(this.diff == p.diff) return this.ele-p.ele;
        return this.diff - p.diff;
    }

}
public class k_closest_integer_LT673 {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>() ;
        PriorityQueue<pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            int d = Math.abs(x - arr[i]);
            pq.add(new pair(arr[i],d));
            if (pq.size()>k) pq.remove();
        }
        while (pq.size()>0){
            pair a = pq.remove();
            ans.add(a.ele);
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int x =3;
        int k = 4;
        List<Integer> h = findClosestElements(arr,k,x);
        System.out.println(h);
    }
}
