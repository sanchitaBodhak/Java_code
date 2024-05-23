package recursion;
import java.util.Scanner;
public class power {
    public static int pow(int a, int b){
        if (a ==0 && b == 0){
            return -1;
        }
        if (b == 0){
            return 1;
        }
        int ans = pow(a,b/2);
        if ( b%2 == 0) return ans*ans ;
        else return ans*ans*a ;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base : ");
        int a = sc.nextInt();
        System.out.println("Enter power : ");
        int b = sc.nextInt();
        int ans = pow(a,b);
        System.out.println(a +" to the power " +b+ " is "+ ans);
    }
}
