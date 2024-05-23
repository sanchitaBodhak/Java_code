package recursion;

import java.util.Scanner;

public class factorial {
    public static int fact (int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * fact( n-1);
    }

    public static void main(String[] args) {
        System.out.println("enter n :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(" the factorial is..."+ans );
    }

}
