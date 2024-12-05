package Heaps;

import java.util.HashMap;
import java.util.PriorityQueue;
class Pair2 implements Comparable<Pair2>{
    int ele;
    int freq;
    Pair2(int ele,int freq){
        this.ele = ele;
        this.freq = freq;
    }
    public int compareTo(Pair2 p){
        if(this.freq == p.freq) return this.ele-p.ele;
        return this.freq - p.freq;
    }

}
public class top_K_frequent_element_LT347 {
    public static int[] topKFrequent(int[] arr, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }else
            map.put(arr[i],1);
        }
        //minheaop
        PriorityQueue<Pair2> pq = new PriorityQueue<>();
        for (int ele : map.keySet()) {
            int freq = map.get(ele);
            pq.add(new Pair2(ele,freq));
            if (pq.size()>k) pq.remove();
        }
        for (int i = 0; i < k; i++) {
            Pair2 p = pq.remove();
            ans[i] = p.ele;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,3,5,2,2,6,2,2,10};
        int[] ans = topKFrequent(arr,2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+"\t");
        }
    }
}
