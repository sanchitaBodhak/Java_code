package pattern_problem;

import java.util.Scanner;

public class Number_pyramid_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give no of rows");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" " + " ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            for (int l = i-1; l > 0 ; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
