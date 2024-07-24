package recursion;

import java.util.Scanner;

public class HCF_optimised {
    public static int hcf( int a, int b){     // body of hcf func
        if (b%a == 0){
            return a;
        }
        return hcf(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter first no :");
        int a = sc.nextInt();
        System.out.println(" enter second no :");
        int b = sc.nextInt();
        System.out.println(hcf(a,b));   // calling function
    }
}
