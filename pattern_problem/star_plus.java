package pattern_problem;

import java.util.Scanner;
public class star_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of square pattern in odd number");
        int n = sc.nextInt();
        int mid = n/2 + 1;  // finding middle row and column
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == mid || j == mid){
                    System.out.print("*" + " ");  // printing thr stars
                }else {
                    System.out.print(" " + " "); // printing the spaces
                }
            }
            System.out.println();
        }
    }
}
