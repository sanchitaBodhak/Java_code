import java.util.Scanner;
public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number...");
        int number = sc.nextInt();
        int sum = 0 ;
        int last_digit;
        while( number > 0){
            last_digit = number % 10;
            sum = sum + last_digit;
            number = number/10;

        }
        System.out.println("the sum of digits are ... " + sum);

    }
}