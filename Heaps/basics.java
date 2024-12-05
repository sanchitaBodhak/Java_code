package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class basics {
    public static void main(String[] args) {
        //min-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        System.out.println(pq);
        pq.add(3);
        System.out.println(pq);
        pq.add(40);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.add(2);
        System.out.println(pq);
        System.out.println(pq.size());
    // max-heap
        PriorityQueue<Integer> pq_max = new PriorityQueue<>(Collections.reverseOrder());
        pq_max.add(10);
        pq_max.add(20);
        System.out.println(pq_max);
        pq_max.add(3);
        System.out.println(pq_max);
        pq_max.add(40);
        System.out.println(pq_max);
        pq_max.remove();
        System.out.println(pq_max);
        pq_max.add(2);
        System.out.println(pq_max);
        System.out.println(pq.size());

    }
}
