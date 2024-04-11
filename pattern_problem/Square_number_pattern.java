package pattern_problem;

import java.util.Scanner;
public class Square_number_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of pattern");
        int l = sc.nextInt();
        System.out.println("Enter breadth of pattern");
        int b = sc.nextInt();
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
