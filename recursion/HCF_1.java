package recursion;
    // time complexity is O(n)..... FURTHER OPTIMIZATION POSSIBLE
import java.util.Scanner;

public class HCF_1 {
    public static int hcf( int a, int b){     // body of hcf func
        for (int i = Math.min(a,b) ; i>0 ; i--){    // loop goes backwards to get highest no.
            if (a%i ==0 && b%i == 0){
                return i;
            }
        }
        return 1;
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
