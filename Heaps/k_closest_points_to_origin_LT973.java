package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

class trio implements Comparable<trio> {
    int dist;
    int x;
    int y;

    trio(int dist, int x, int y) {
        this.dist = dist;
        this.x = x;
        this.y = y;
    }

    public int compareTo(trio t) {
        return this.dist - t.dist;
    }
}
public class k_closest_points_to_origin_LT973 {

    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<trio> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
                int d = x*x + y*y;
                pq.add(new trio(d,x,y));

            if (pq.size()>k) pq.remove();
        }
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            trio t = pq.remove();
            ans[i][0] = t.x;
            ans[i][1] = t.y;
        }
        return ans;
        }

    public static void main(String[] args) {
        int[][] arr = {{1, 0}, {0, 1}, {0, 3}};
        int k = 2;
        int[][] ans = kClosest(arr, k);
        for (int i = 0; i < k; i++) {
            System.out.print(ans[i][0]);
            System.out.print(ans[i][1]);
            System.out.println();
        }
    }
}
