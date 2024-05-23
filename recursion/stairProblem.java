package recursion;

import java.util.Scanner;

// Find no. of ways to reach nth stair if 1 or 2 jump at a time is allowed
public class stairProblem {
    public static int stair( int n) {
        if (n <= 2) {
            return n;
        }
        return stair(n-1) + stair( n-2);
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println(" give n :");
            int n = sc.nextInt();
            int ans = stair(n);
            System.out.println(" your no of ways to reach " + n + "th stairs is ..." + ans);
        }
}
