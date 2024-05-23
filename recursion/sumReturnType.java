package recursion;

import java.util.Scanner;

public class sumReturnType {
    public static int sum (int n ){
        if(n == 0){  // base case
            return 0;
        }
         return  n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
         int ans = sum(n);
        System.out.println(" the sum till n is..." + ans);
    }
}
