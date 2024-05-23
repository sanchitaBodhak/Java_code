package recursion;

import java.util.Scanner;

public class mazePath { // path can only go rightways or downways
    public static int maze( int m ,int n){
        if( m==1 || n==1){
            return 1;
        }
        int righways = maze( m, n-1);
        int downways = maze( m-1, n);
        return righways + downways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" give no. of row of maze");
        int m  = sc.nextInt();
        System.out.println(" give no. of column of maze");
        int n  = sc.nextInt();
        int ans  = maze(m,n);
        System.out.println(" your no of ways to travel the maze is ..."+ans);
    }
}
