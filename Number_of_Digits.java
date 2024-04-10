import java.util.Scanner;
public class Number_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number...");
        int number = sc.nextInt();
        int count = 0 ;    // initialize a counter
        while( number > 0){
            number = number/10;
            count++;      // increasing the counter
        }
        System.out.println("the no of digits are ... " + count);
    }
}
