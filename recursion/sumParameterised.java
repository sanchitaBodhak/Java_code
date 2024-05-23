package recursion;
import java.util.Scanner;
public class sumParameterised { // printing sum without storing anywhere
    public static void sum (int n , int sum){
        if(n == 0){  // base case
            System.out.println(sum);
            return;
        }
        sum(n-1,sum+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        sum(n,0);
    }
}
