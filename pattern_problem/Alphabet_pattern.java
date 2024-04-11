package pattern_problem;

import java.util.Scanner;
public class Alphabet_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows ");
        int r = sc.nextInt();
        System.out.println("Enter the no of sequential element needed in each row ");
        int a = sc.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < a; j++) {
                char ch = (char) (j + 65);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
