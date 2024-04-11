package pattern_problem;

import java.util.Scanner;
public class no_alphabet_mixed_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give no of rows");
        int row = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%2 == 1)
                    System.out.print(j + " ");
                else
                    System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
