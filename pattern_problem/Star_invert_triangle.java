package pattern_problem;

import java.util.Scanner;
public class Star_invert_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give no of rows");
        int row = sc.nextInt();
        for ( int i = row ; i > 0; i--){
            for (int j = 0; j < i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
