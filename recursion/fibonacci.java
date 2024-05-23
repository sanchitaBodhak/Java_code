package recursion;

import java.util.Scanner;

public class fibonacci {
    public static int fib( int n){
        if( n == 1){
            return 0;
        }
        if (n == 2){
            return 1 ;
        }
        return fib(n-1) + fib( n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" give n :");
        int n  = sc.nextInt();
        int ans  = fib(n);
        System.out.println(" your "+n+"th fibonacci no. is ..."+ans);
    }
}
