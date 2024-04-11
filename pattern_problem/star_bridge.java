package pattern_problem;

import java.util.Scanner;

public class star_bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give no of rows");
        int n = sc.nextInt();
        for ( int a = 1 ; a <= 2*n - 1 ; a++){ // for 1st row
            System.out.print("*"+" ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {   // for further rows
            for (int j = n - i; j >= 1; j--) {
                System.out.print("*" + " ");
            }
            for (int k = 1; k <= 2*i - 1 ; k++) {
                System.out.print(" " + " ");
            }
            for (int l = n-1 ; l >= i; l--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
